package array;

/** @Auther: fido @Date: 2018/6/15 17:30 @Description:给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。 */
public class Soluation3 {
  public void rotate(int[] nums, int k) {
    //    int a = nums[0];
    //    for (int i = 0; i < k; i++) {
    //      int temp = nums[nums.length - 1];
    //      for (int j = 0; j < nums.length - 1; j++) {
    //        int b = nums[j + 1];
    //        nums[j + 1] = a;
    //        a = b;
    //      }
    //      nums[0] = temp;
    //    }
    k = k % nums.length;
    reverse(nums, 0, nums.length - 1 - k);
    reverse(nums, nums.length - k, nums.length - 1);
    reverse(nums, 0, nums.length - 1);
  }

  // 反转数组
  public void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int a = nums[start];
      nums[start] = nums[end];
      nums[end] = a;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    Soluation3 soluation3 = new Soluation3();
    int[] test = new int[] {1, 2};
    soluation3.rotate(test, 3);
    for (int i = 0; i < test.length; i++) {
      System.out.println(test[i]);
    }
  }
}
