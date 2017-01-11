/**
 * Created by wei4liverpool on 1/10/17.
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 寻找二叉树的最长子节点的深度

 public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 */

/**
 * Solution:使用递归调用判断:递归判断左右子树的长度+1为最深;若root节点为空则为深度为0;
 */
public class Maximum_Depth_of_Binary_Tree {

    public static void main(String[] args) {
         TreeNode root=new TreeNode(1);
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(3);
        root.left=n1;
        root.right=n2;


        TreeNode n3=new TreeNode(4);
        TreeNode n5=new TreeNode(5);

        n2.left=n3;
        n2.right=n5;

        TreeNode n6=new TreeNode(6);
        TreeNode n7=new TreeNode(7);
        n3.left=n6;
        n6.right=n7;
        System.out.println("max depth:"+maxDepth(root));

    }

    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int leftDepth=maxDepth(root.left)+1;
        int rightDepth=maxDepth(root.right)+1;

        return leftDepth>=rightDepth?leftDepth:rightDepth;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }



}
