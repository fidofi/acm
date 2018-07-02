package tree;

/** @Auther: fido @Date: 2018/7/2 13:03 @Description:给定一个二叉树，找出其最大深度。 */
public class Soluation1 {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = maxDepth(root.left)+1;
    int right = maxDepth(root.right)+1;

    return left > right ? left : right;
  }
}
