import apple.laf.JRSUIUtils.Tree;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

 According to the definition of LCA on Wikipedia:
 “The lowest common ancestor is defined between two nodes v and w as the lowest node in T
 that has both v and w as descendants (where we allow a node to be a descendant of itself).”


    _______3______
    /              \
 ___5__          ___1__
 /      \        /      \
 6      _2       0       8
 /  \
 7   4


 *For example, the lowest common ancestor (LCA) of nodes
 * 5 and 1 is 3.
 * Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself
 * according to the LCA definition.


 *
 *
 * Created by weixing on 17/11/21.
 */
public class Lowest_Common_Ancestor_of_a_Binary_Tree {

  public static void main(String[] args) {
    TreeNode root=new TreeNode(3);
    TreeNode n1=new TreeNode(5);
    TreeNode n2=new TreeNode(1);
    TreeNode n3=new TreeNode(6);
    TreeNode n4=new TreeNode(2);
    TreeNode n5=new TreeNode(7);
    TreeNode n6=new TreeNode(4);
    TreeNode n8=new TreeNode(0);
    TreeNode n9=new TreeNode(6);
    root.left=n1;root.right=n2;
    n1.left=n3;n1.right=n4;
    n2.left=n8;n2.right=n9;
    n3.left=n5;n3.right=n6;

    TreeNode n=lowestCommonAncestor(root,n3,n4);
    System.out.printf("node:"+n.val+"\n");

  }



  public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root==null){
      return null;
    }

    if(root.val==q.val||root.val==p.val){
      return root;
    }


    TreeNode lNode=lowestCommonAncestor(root.left,p,q);
    TreeNode rNode=lowestCommonAncestor(root.right,p,q);

    if(lNode!=null && rNode!=null){
      if(p.val!=q.val){
        TreeNode lNode1=lowestCommonAncestor(lNode,p,p);
        TreeNode lNode2=lowestCommonAncestor(lNode,q,q);
        if(lNode1!=null && lNode2!=null){
          return lNode;
        }

        TreeNode rNode1=lowestCommonAncestor(rNode,p,p);
        TreeNode rNode2=lowestCommonAncestor(rNode,q,q);
        if(rNode1!=null && rNode2!=null){
          return rNode;
        }

      }

      return root;
    }

    return lNode==null?rNode:lNode;

  }


  public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }



}
