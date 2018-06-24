package dp;

/**
 * @Auther: fido @Date: 2018/6/21 13:34 @Description:给定一个整数数组 nums
 * ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Soluation3 {
  public int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE; // 表明最大值
    int cur = 0; // 表明当前累加值
    for (int i = 0; i < nums.length; i++) {
      cur = cur + nums[i];
      if (cur > max) {
        max = cur;
      }
      if (cur < 0) {
        cur = 0; // 重新开始
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Soluation3 soluation3 = new Soluation3();
    int[] target = new int[] {-1};
    System.out.println(soluation3.maxSubArray(target));
  }
}
