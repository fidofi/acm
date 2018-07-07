package tree;

/** @Auther: fido @Date: 2018/7/7 22:22 @Description: 将有序数组转为二叉搜索树 */
public class Soluation5 {
  public TreeNode sortedArrayToBST(int[] nums) {
    if ((nums == null || nums.length == 0)) {
      return null;
    }
    return getTree(nums, 0, nums.length - 1);
  }

  public TreeNode getTree(int[] nums, int start, int end) {
    if (start <= end) {
      int mid = start + (end - start) / 2;
      TreeNode treeNode = new TreeNode(nums[mid]);
      treeNode.left = getTree(nums, start, mid - 1);
      treeNode.right = getTree(nums, mid + 1, end);
      return treeNode;
    } else {
      return null;
    }
  }
}
