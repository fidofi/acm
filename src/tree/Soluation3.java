package tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Auther: fido @Date: 2018/7/6 19:55 @Description:给定一个二叉树，检查它是否是镜像对称的。
 *
 * <p>例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 */
public class Soluation3 {

  public static boolean isSymmetric(TreeNode root) {
    if (root == null) return true;
    return checkIsSymmetric(root.left, root.right);
  }

  private static boolean checkIsSymmetric(TreeNode leftNode, TreeNode rightNode) {
    if (leftNode == null && rightNode == null) return true;
    if ((leftNode != null && rightNode == null) || (leftNode == null && rightNode != null))
      return false;
    if (leftNode.val != rightNode.val) return false;
    return checkIsSymmetric(leftNode.left, rightNode.right)
        && checkIsSymmetric(leftNode.right, rightNode.left);
  }

  //    public boolean isSymmetric(TreeNode root) {
  //        // IMPORTANT: Please reset any member data you declared, as
  //        // the same Solution instance will be reused for each test case.
  //        if (root == null)
  //            return true;
  //        Stack<TreeNode> s1 = new Stack<TreeNode>();
  //        Stack<TreeNode> s2 = new Stack<TreeNode>();
  //        s1.push(root.left);
  //        s2.push(root.right);
  //        while (!s1.empty() && !s2.empty()) {
  //            TreeNode n1 = s1.pop();
  //            TreeNode n2 = s2.pop();
  //            if (n1 == null && n2 == null)
  //                continue;
  //            if (n1 == null || n2 == null)
  //                return false;
  //            if (n1.val != n2.val)
  //                return false;
  //            s1.push(n1.left);
  //            s2.push(n2.right);
  //            s1.push(n1.right);
  //            s2.push(n2.left);
  //        }
  //        return true;
  //    }
}
