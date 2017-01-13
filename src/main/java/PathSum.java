/**
 * Created by wei4liverpool on 1/12/17.
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values
 * along the path equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 *
 *   5
    / \
    4   8
 /      / \
 11     13  4
 /  \       \
 7    2      1

 return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

 *
 */
public class PathSum {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(3);

        root.left=n1;
        root.right=n2;

        //TreeNode n3=new TreeNode(4);
        //TreeNode n4=new TreeNode(5);

        //n1.left=n3;
        //n1.right=n4;

        //TreeNode n6=new TreeNode(1);
        //n4.right=n6;

        System.out.printf("Sum:1,Tree has sum:"+hasPathSum(root,1));
    }

    public static boolean  hasPathSum(TreeNode root, int sum) {

        if(root==null) {
            return false;
        }

        if(sum-root.val==0){
            return true;
        }

        if(root.left==null && root.right==null){
            return root.val==sum;
        }

        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
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
