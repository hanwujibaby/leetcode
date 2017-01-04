/**
 * Created by wei4liverpool on 1/3/17. Given a binary tree, return the level order traversal of its
 * nodes' values. (ie, from left to right, level by level).
 * 
 * For example: Given binary tree [3,9,20,null,null,15,7], 3 / \ 9 20 / \ 15 7 return its level
 * order traversal as: [ [3], [9,20], [15,7] ]
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class Binary_Tree_Level_Order_Traversal {

  public static void main(String[] args) {
    TreeNode node = new TreeNode(3);
    TreeNode l = new TreeNode(9);
    TreeNode r = new TreeNode(20);
    TreeNode l1 = new TreeNode(15);
    TreeNode r1 = new TreeNode(7);

    node.left = l;
    node.right = r;
    r.left = l1;
    r.right = r1;

    List<List<Integer>> list = levelOrder(node);
    for (int i = 0; i < list.size(); i++) {
        String s="";
      for (int j = 0; j< list.get(i).size(); j++) {
        s+=list.get(i).get(j)+";";
      }
        System.out.println(s);
    }

  }


  public static List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> list = new ArrayList<List<Integer>>();
      Queue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
      Queue<TreeNode> tempQueue= new LinkedBlockingQueue<TreeNode>();
      queue.add(root);

      Queue<TreeNode> dequeue = new LinkedBlockingQueue<TreeNode>();
      while (!queue.isEmpty()) {
          List<Integer> ll=new ArrayList<Integer>();
          while(queue.isEmpty()==false){
              TreeNode n=queue.poll();
              dequeue.add(n);

              if (n.left != null) {
                  tempQueue.add(n.left);
              }

              if (n.right != null) {
                  tempQueue.add(n.right);
              }
          }

          while(dequeue.isEmpty()==false){
              TreeNode treeNode=dequeue.poll();
              ll.add(treeNode.val);
          }

          list.add(ll);
          while(!tempQueue.isEmpty()){
              queue.add(tempQueue.poll());
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
