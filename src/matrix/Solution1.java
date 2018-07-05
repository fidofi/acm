package matrix;

import java.util.ArrayList;
import java.util.List;

/** @Auther: fido @Date: 2018/7/4 21:37 @Description: 旋转矩阵 */
public class Solution1 {
  public List<Integer> spiralOrder(int[][] matrix) {
    int lx = 0;
    int ly = 0;
    List<Integer> result = new ArrayList<>();
    if (matrix.length == 0) {
      return result;
    }
    int rx = matrix.length - 1;
    int ry = matrix[0].length - 1;
    while (lx <= rx && ly <= ry) {
      this.push(result, matrix, lx++, ly++, rx--, ry--);
    }
    return result;
  }

  public List<Integer> push(List<Integer> list, int[][] matrix, int lx, int ly, int rx, int ry) {
    // 只有一行
    if (lx == rx) {
      for (int i = ly; i <= ry; i++) {
        list.add(matrix[lx][i]);
      }
      // 只有一列
    } else if (ly == ry) {
      for (int i = lx; i <= rx; i++) {
        list.add(matrix[i][ly]);
      }
    }
    // 正常情况
    else {
      int curLx = lx;
      int curLy = ly;
      while (curLy != ry) {
        list.add(matrix[lx][curLy]);
        curLy++;
      }
      while (curLx != rx) {
        list.add(matrix[curLx][ry]);
        curLx++;
      }
      while (curLy != ly) {
        list.add(matrix[rx][curLy]);
        curLy--;
      }
      while (curLx != lx) {
        list.add(matrix[curLx][ly]);
        curLx--;
      }
    }
    return list;
  }
}
