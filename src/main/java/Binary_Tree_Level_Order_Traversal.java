/**
 * Created by wei4liverpool on 1/3/17.
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
    /  \
   15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]

 */


import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Binary_Tree_Level_Order_Traversal {

    public static void main(String[] args) {
        TreeNode node=new  TreeNode(3);
        TreeNode l=new  TreeNode(9);
        TreeNode r=new  TreeNode(20);
        TreeNode l1=new  TreeNode(15);
        TreeNode r1=new  TreeNode(7);

        node.left=l;
        node.right=r;
        r.left=l1;
        r.right=r1;

    }


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list=new ArrayList<List<Integer>>();
        return list;
    }


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
}
