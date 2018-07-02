package string;

/**
 * @Auther: fido @Date: 2018/6/24
 * 22:21 @Description:在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 */
public class Soluation6 {
  /**
   * 48-57代表0-9 32代表空格
   *
   * @param str
   * @return
   */
  public int myAtoi(String str) {
    int index = 0;
    int length = str.length();
    int base=0;
    boolean isMinus = false;
    StringBuffer stringBuffer = new StringBuffer();
    while (index < length && str.charAt(index) == 32) {
      index++;
    }
    if (index == length) {
      return 0;
    }
    // 此时index代表非空字符第一个
    if (!isLegal(str.charAt(index)) && str.charAt(index) != 32) {
      return 0;
    }

    if (str.charAt(index) == 32) {
      isMinus = true;
      index++;
    }
    while (index < length && isLegal(str.charAt(index))) {

      stringBuffer.append(str.charAt(index));
      index++;
    }
    int result = Integer.valueOf(stringBuffer.toString());
    if (isMinus) {
      result = 0 - result;
    }
    return result;
  }

  public boolean isLegal(char c) {
    if (c >= 48 && c <= 57) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Soluation6 soluation6 = new Soluation6();
    int result = soluation6.myAtoi("2147483648");
    System.out.println(result);
  }
}
