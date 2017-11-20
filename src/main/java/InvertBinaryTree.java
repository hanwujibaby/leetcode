
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

  }


  public TreeNode invertTree(TreeNode root) {
    return root;
  }


  class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;
    TreeNode(int v){
      this.value=v;
    }
  }

}
