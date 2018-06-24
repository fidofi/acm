package array;

/**
 * @Auther: fido @Date: 2018/6/18 12:52 @Description:给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class Soluation8 {
  public void moveZeroes(int[] nums) {
    int start = 0;
    int end = 0;
    int length = nums.length;
    while (start < length && end < length) {
      if (nums[start] == 0) {
        while (end < length-1&&nums[end] == 0) {
          end++;
        }
        int cur = nums[end];
        nums[end] = nums[start];
        nums[start] = cur;
      }
      start++;
      end++;
    }
  }

  public static void main(String[] args) {
    Soluation8 soluation8 = new Soluation8();
    int[] nums1 = new int[] {0,2,1};
    soluation8.moveZeroes(nums1);
    for (int i = 0; i < nums1.length; i++) {
      System.out.println(nums1[i]);
    }
  }
}
