package string;

import java.util.*;

/** @Auther: fido @Date: 2018/6/19 12:14 @Description:给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 */
public class Soluation3 {
  public int firstUniqChar(String s) {
    int[] result = new int[26];
    for (int i = 0; i < s.length(); i++) {
      result[s.charAt(i) - 'a'] = result[s.charAt(i) - 'a'] + 1;
    }
    for (int i = 0; i < s.length(); i++) {
      if (result[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Soluation3 soluation3 = new Soluation3();
    int result = soluation3.firstUniqChar("loveleetcode");
    System.out.println(result);
  }
}
