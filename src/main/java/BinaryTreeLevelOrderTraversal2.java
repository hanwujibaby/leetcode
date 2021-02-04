import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15  7
 * <p>
 * <p>
 * <p>
 * 返回其自底向上的层次遍历为：
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */

public class BinaryTreeLevelOrderTraversal2 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20);
        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        right1.right = right2;


        List<List<Integer>> resulst = levelOrderBottom(root);
        String re = "";
        for (int i = 0; i < resulst.size(); i++) {
            String s = "";
            for (int j = 0; j < resulst.get(i).size(); j++) {
                s += resulst.get(i).get(j) + ";";
            }
            re += s + "\n";
            System.out.println(re);
        }

    }


    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> resultList = new LinkedList<List<Integer>>();
        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        List<Integer> nodeList = new LinkedList<Integer>();
        List<TreeNode> leafList = new LinkedList<TreeNode>();
        if (root != null) {
            nodeList.add(root.val);
            stack.push(nodeList);
            if (root.left != null) {
                leafList.add(root.left);
            }
            if (root.right != null) {
                leafList.add(root.right);
            }
        }

        while (leafList.isEmpty() == false) {
            nodeList = new LinkedList<Integer>();
            List<TreeNode> tmpList = new LinkedList<TreeNode>();
            for (int i = 0; i < leafList.size(); i++) {
                TreeNode node = leafList.get(i);
                nodeList.add(node.val);
                if (node.left != null) {
                    tmpList.add(node.left);
                }
                if (node.right != null) {
                    tmpList.add(node.right);
                }
            }


            if (nodeList.isEmpty() == false) {
                stack.push(nodeList);
            }

            leafList.clear();
            for (int i = 0; i < tmpList.size(); i++) {
                leafList.add(tmpList.get(i));
            }
        }

        while (stack.isEmpty() == false) {
            resultList.add(stack.pop());
        }

        return resultList;
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
