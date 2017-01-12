/**
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as
 a binary tree in which the depth of the two subtrees of every node
 never differ by more than 1.
 
 * Created by vixy on 17-1-11.
 *
 * Solution:使用递归算法进行计算，算出左右子树的高度，并比较是否大于0或者1；
 */
public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode n0=new TreeNode(1);
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(3);

        n0.left=n1;
        n0.right=n2;

        TreeNode n3=new TreeNode(4);
        TreeNode n4=new TreeNode(5);
        n1.left=n3;
        n1.right=n4;

        //TreeNode n5=new TreeNode(7);
        //TreeNode n6=new TreeNode(8);
        //n4.right=n5;
        //n5.right=n6;

        System.out.printf("Tree is balanced binary tree:"+isBalanced(n0));

    }



    public static int getDepth(TreeNode root){
        if(root==null){
            return  0;
        }
        int leftDep=getDepth(root.left)+1;
        int rightDep=getDepth(root.right)+1;


        return leftDep>rightDep?leftDep:rightDep;
    }

    public static boolean isBalanced(TreeNode root) {
        boolean isBalanced=false;
        int leftDepth=getDepth(root.left)+1;
        int rightDepth=getDepth(root.right)+1;
        int s=Math.abs(leftDepth-rightDepth);
        return s>1?false:true;
    }


    public static class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
}

