package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: fido @Date: 2018/6/19 17:26 @Description:给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。示例 1:
 *
 * <p>输入: s = "anagram", t = "nagaram" 输出: true
 */
public class Soluation4 {
  /**
   * 个数一样 出现的字符每个个数也一样
   *
   * @param s
   * @param t
   * @return
   */
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] array1 = new int[26];
    int[] array2 = new int[26];
    for (int i = 0; i < s.length(); i++) {
      array1[s.charAt(i) - 'a'] = array1[s.charAt(i)-'a'] + 1;
    }
    for (int i = 0; i < t.length(); i++) {
      array2[t.charAt(i) - 'a'] = array2[t.charAt(i)-'a'] + 1;
    }
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        return false;
      }
    }
    return true;
  }
}
