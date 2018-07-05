package matrix;

/** @Auther: fido @Date: 2018/7/4 22:43 @Description:将正方形矩阵顺时针旋转九十度 */
public class Solution2 {
  public void rotate(int[][] matrix) {
    int lx = 0;
    int ly = 0;
    int rx = matrix.length - 1;
    int ry = matrix[0].length - 1;
    while (lx < rx) {
      rotateEdage(matrix, lx++, ly++, rx--, ry--);
    }
  }

  /**
   * 也是需要分组解决，解决好每个点与每个点的对应
   *
   * @param matrix
   * @param lx
   * @param ly
   * @param rx
   * @param ry
   */
  public void rotateEdage(int[][] matrix, int lx, int ly, int rx, int ry) {
    int num = (ry - ly); // 一次共有多少组旋转
    int temp = 0;
    for (int i = 0; i < num; i++) {
      temp = matrix[lx][ly + i];
      matrix[lx][ly + i] = matrix[rx - i][ly];
      matrix[rx - i][ly] = matrix[rx][ry - i];
      matrix[rx][ry - i] = matrix[lx + i][ry];
      matrix[lx + i][ry] = temp;
    }
  }

  public static void main(String[] args) {
    Solution2 soluation2 = new Solution2();
    int[] target1 = new int[] {5, 1, 9, 11};
    int[] target2 = new int[] {2, 4, 8, 10};
    int[] target3 = new int[] {13, 3, 6, 7};
    int[] target4 = new int[] {15, 14, 12, 16};
    int[][] matrix = new int[][] {target1, target2, target3, target4};
    soluation2.rotate(matrix);
  }
}
