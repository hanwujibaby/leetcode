/**
 * Created by wei4liverpool on 1/3/17.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 *
 * }
 * Solution:递归比较;
 */
public class SameTree {
    public static void main(String[] args) {

    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    public static boolean isSameTree(TreeNode p,TreeNode q){
        boolean flag=false;
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val==q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }

        return flag;
    }

}
