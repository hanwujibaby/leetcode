
/**
 * Invert a binary tree.

    4
   /    \
  2      7
 / \    / \
 1   3  6   9
 to
   4
  /    \
 7      2
 / \    / \
 9   6  3   1

 *
 * Created by weixing on 17/11/20.
 */
public class InvertBinaryTree {




  public static void main(String[] args) {
    TreeNode root=new TreeNode(4);
    TreeNode l1=new TreeNode(2);
    TreeNode r1=new TreeNode(7);
    root.left=l1;//root.right=r1;
    //root.right=r1;
    /*
    TreeNode l2=new TreeNode(1);
    TreeNode r2=new TreeNode(3);
    l1.left=l2;//l1.right=r2;
    TreeNode l3=new TreeNode(6);
    TreeNode r3=new TreeNode(9);
    r1.left=l3;r1.right=r3;
    */

    TreeNode node=invertTree(root);
    System.out.print(node);

  }


  public static TreeNode invertTree(TreeNode root) {
    if(root==null){
      return null;
    }


    boolean flag=true;
    if(root.left==null &&root.right!=null){
      root.left=root.right;
      root.right=null;
      flag=false;
      //return root;
    }

    if(flag&& root.left!=null &&root.right==null){
      root.right=root.left;
      root.left=null;
      //return root;
    }

    /*
    TreeNode leftNode=root.left;
    */
    TreeNode tmpNode=null;

    if(root.left!=null && root.right!=null){
      tmpNode=root.left;
      root.left=root.right;
      root.right=tmpNode;
    }

    invertTree(root.left);
    invertTree(root.right);

    return root;
  }


  static class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;
    TreeNode(int v){
      this.value=v;
    }

  }

}
