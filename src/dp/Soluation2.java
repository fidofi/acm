package dp;

/**
 * @Auther: fido @Date: 2018/6/21 13:19 @Description: 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * <p>如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 *
 * <p>注意你不能在买入股票前卖出股票。
 */
public class Soluation2 {
  public int maxProfit(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }
    int min = prices[0];
    int result = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > min) {
        int cur = prices[i] - min;
        if (cur > result) {
          result = cur;
        }
      } else min = prices[i];
    }
    return result;
  }

  public static void main(String[] args) {
    Soluation2 soluation2 = new Soluation2();
    int[] target = new int[] {7, 1, 5, 3, 6, 4};
    System.out.println(soluation2.maxProfit(target));
  }
}
