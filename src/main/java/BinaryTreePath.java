import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei4lfc on 18/02/2018.
 * Given a binary tree, return all root-to-leaf paths.
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]
 */
public class BinaryTreePath {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode r2 = new TreeNode(5);
        root.left = l1;
        root.right = r1;
        l1.right = r2;
        List<String> list = binaryTreePaths(root);
        for (String e : list) {
            System.out.println(e + "\t");
        }


    }


    public static List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<String>();
        if (root == null) {
            return list;
        }

        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.val));
            return list;
        }

        if (root.left != null) {
            List<String> leftList = binaryTreePaths(root.left);
            if (leftList != null && leftList.size() > 0) {
                for (int i = 0; i < leftList.size(); i++) {
                    list.add(root.val + "->" + leftList.get(i));
                }

            }
        }

        if (root.right != null) {
            List<String> rightList = binaryTreePaths(root.right);
            if (rightList != null && rightList.size() > 0) {
                for (int i = 0; i < rightList.size(); i++) {
                    list.add(root.val + "->" + rightList.get(i));
                }

            }

        }
        return list;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
