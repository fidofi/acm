package tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/** @Auther: fido @Date: 2018/7/7 21:36 @Description: 二叉树的层次遍历 */
public class Soluation4 {
  public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    TreeNode last = root;
    TreeNode cur = null;
    queue.offer(root);
    List<Integer> list = new ArrayList<>();
    list = new ArrayList<>();
    while (!queue.isEmpty()) {
      root = queue.poll();
      list.add(root.val);
      if (root.left != null) {
        queue.offer(root.left);
        cur = root.left;
      }
      if (root.right != null) {
        queue.offer(root.right);
        cur = root.right;
      }
      if (root == last) {
        result.add(list);
        list = new ArrayList<>();
        last = cur;
      }
    }
    return result;
  }
}
