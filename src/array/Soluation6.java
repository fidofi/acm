package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: fido @Date: 2018/6/17 22:33 @Description:给定两个数组，写一个方法来计算它们的交集。
 *
 * <p>例如: 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 */
public class Soluation6 {
  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer cur : nums1) {
      map.put(cur, map.containsKey(cur) ? (map.get(cur) + 1) : 1);
    }
    for (Integer cur : nums2) {
      if (map.containsKey(cur) && map.get(cur) > 0) {
        list.add(cur);
        map.put(cur, map.get(cur) - 1);
      }
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }

  public static void main(String[] args) {
    Soluation6 soluation6 = new Soluation6();
    int[] nums1 = new int[] {1, 2};
    int[] nums2 = new int[] {1, 1};
    int[] result = soluation6.intersect(nums1, nums2);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
