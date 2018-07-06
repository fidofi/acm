package tree;

import java.util.ArrayList;

/** @Auther: fido @Date: 2018/7/6 19:47 @Description:给定一个二叉树，判断其是否是一个有效的二叉搜索树。 */
public class Soluation2 {

  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  public boolean valid(TreeNode root, long low, long high) {
    if (root == null) {
      return true;
    }
    if (root.val <= low || root.val >= high) {
      return false;
    }
    return valid(root.left, low, root.val) && valid(root.right, root.val, high);
  }

  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(0);
    Soluation2 soluation2 = new Soluation2();
    System.out.println(soluation2.isValidBST(null));
  }
}
