package string;

/** @Auther: fido @Date: 2018/6/19 11:54 @Description:请编写一个函数，其功能是将输入的字符串反转过来。 */
public class Soluation1 {
  public String reverseString(String s) {
    char[] result = s.toCharArray();
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      char cur = s.charAt(start);
      result[start] = result[end];
      result[end] = cur;
      start++;
      end--;
    }
    return new String(result);
  }

  public static void main(String[] args) {
    String s = "aadfdfdfbbcc";
    Soluation1 soluation1 = new Soluation1();
    String result = soluation1.reverseString(s);
    System.out.println(result);
  }
}
