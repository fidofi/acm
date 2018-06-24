package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: fido @Date: 2018/6/16 15:57 @Description:给定一个整数数组，判断是否存在重复元素。
 *
 * <p>如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */
public class Soluation4 {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return true;
      } else set.add(nums[i]);
    }
    return false;
  }
}
