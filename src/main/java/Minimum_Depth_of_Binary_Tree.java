import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

 * Created by wei4liverpool on 1/13/17.
 *
 * Solution:通过BFS实现,在BFS遍历每一个层级的叶子节点的时候,判断第一个没有左右子树的节点,返回层级的高度即可;
 */
public class Minimum_Depth_of_Binary_Tree {
    public static void main(String[] args) {
        TreeNode n1=new TreeNode(5);
        TreeNode n2=new TreeNode(0);
        TreeNode n3=new TreeNode(-4);
        n1.left=n2;
        n1.right=n3;
        TreeNode n4=new TreeNode(-1);
        TreeNode n5=new TreeNode(-6);
        n2.left=n4;
        n2.right=n5;

        TreeNode n6=new TreeNode(-9);
        n3.left=n6;
        TreeNode n7=new TreeNode(7);
        TreeNode n8=new TreeNode(1);
        TreeNode n9=new TreeNode(3);
        TreeNode n10=new TreeNode(0);
        n4.left=n7;
        n5.left=n8;
        n5.right=n9;
        n6.right=n10;

        TreeNode n11=new TreeNode(9);
        TreeNode n12=new TreeNode(6);
        TreeNode n13=new TreeNode(0);
        TreeNode n14=new TreeNode(-7);

        n7.right=n11;
        n9.left=n12;
        n10.right=n13;
        n10.right=n14;

        TreeNode n15=new TreeNode(-4);
        TreeNode n16=new TreeNode(1);
        TreeNode n17=new TreeNode(-4);
        n14.left=n15;
        n15.left=n16;
        n16.right=n17;



        System.out.println("tree's minimum depth is:"+minDepth(n1));
    }

    public static int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }

        int minDepth=0;
        boolean flag=false;

        Stack<TreeNode> stack=new Stack<TreeNode>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        stack.add(root);
        while(!stack.empty()){
            while(!stack.empty()){
                TreeNode node=stack.pop();
                if(node.right==null && node.left==null){
                    flag=true;
                    break;
                }

                if(node.right!=null){
                    queue.add(node.right);
                }

                if(node.left!=null){
                    queue.add(node.left);
                }
            }

            if(flag){
                break;
            }

            while(!queue.isEmpty()){
                stack.add(queue.poll());
            }
            minDepth++;

        }
        return minDepth+1;

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }



}
