package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: fido @Date: 2018/6/21 11:49 @Description:假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 *
 * <p>每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * <p>注意：给定 n 是一个正整数。
 */
public class Soluation1 {
  public static Map<Integer, Integer> map = new HashMap<>();

  /**
   * 自底向上的动态规划 使用了状态压缩
   *
   * @param n
   * @return
   */
  public int climbStairs(int n) {
    int f = 1;
    int mid = 1;
    int last = 0;
    if (n == 1) {
      return 1;
    }
    if (n == 0) {
      return 1;
    }
    for (int i = 2; i <= n; i++) {
      last = f + mid;
      f = mid;
      mid = last;
    }
    return last;
  }

  public static void main(String[] args) {
    Soluation1 soluation1 = new Soluation1();
    System.out.println(soluation1.climbStairs(10));
  }
}
