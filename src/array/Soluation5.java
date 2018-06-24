package array;

/**
 * @Auther: fido @Date: 2018/6/16
 * 16:03 @Description:给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Soluation5 {
  public int singleNumber(int[] nums) {
    int a = 0;
    int b = 0;
    for (int i = 0; i < nums.length; i++) {
      b = a ^ nums[i];
      a = b;
    }
    return b;
  }

  public static void main(String[] args) {
    Soluation5 soluation5 = new Soluation5();
    int a = soluation5.singleNumber(new int[] {1, 2, 3, 2, 3});
    System.out.println(a);
  }
}
