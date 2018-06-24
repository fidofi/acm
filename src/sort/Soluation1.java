package sort;

/**
 * @Auther: fido @Date: 2018/6/23 16:24 @Description:给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得
 * num1 成为一个有序数组。
 */
public class Soluation1 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int end = m + n - 1;
    int startM = m - 1;
    int endN = n - 1;
    while (endN >= 0) {
      nums1[end--] =(startM >= 0 && nums1[startM] > nums2[endN]) ? nums1[startM--] : nums2[endN--];
    }
  }

  public static void main(String[] args) {
    Soluation1 soluation1 = new Soluation1();
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};
    soluation1.merge(nums1, 3, nums2, 3);
    for (Integer num : nums1) {
      System.out.println(num);
    }
  }
}
