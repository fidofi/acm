package array;

/**
 * @Auther: fido @Date: 2018/6/18 12:09 @Description:给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 *
 * <p>最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * <p>你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class Soluation7 {
  public int[] plusOne(int[] digits) {
    int nums = 1;
    while (nums == 1) {
      for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] + nums == 10) {
          nums = 1;
          digits[i] = 0;
          if (i == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 0; i < digits.length; i++) {
              result[j + 1] = digits[j];
            }
            return result;
          }
        } else {
          digits[i] = digits[i] + 1;
          nums = 0;
          break;
        }
      }
    }
    return digits;
  }

  public static void main(String[] args) {
    Soluation7 soluation7 = new Soluation7();
    int[] nums1 = new int[] {9};
    int[] result = soluation7.plusOne(nums1);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
