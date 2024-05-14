package cn.codingguide.leetcode.array.execises;

import java.util.ArrayList;
import java.util.List;

/**
 * No54. 螺旋矩阵 <a href="https://leetcode.cn/problems/spiral-matrix/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-05-14
 */
public class No54SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        // 定义4个边界:上下左右
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // 定义 row 和 column 分别作为行和列的索引
        int row = 0, column = 0;
        List<Integer> result = new ArrayList<>();

        while (up <= down && left <= right) {
            // 从左往右遍历
            for (column = left; column <= right && avoid(up, down, left, right); column++) {
                result.add(matrix[row][column]);
            }
            // 遍历完一行后，上边界向下移一位，列坐标要减1，因为上面遍历完毕之后进行了加1操作
            up++;
            column--;

            // 从上往下遍历
            for (row = up; row <= down && avoid(up, down, left, right); row++) {
                result.add(matrix[row][column]);
            }
            right--;
            row--;

            // 从右往左遍历
            for (column = right; column >= left && avoid(up, down, left, right); column--) {
                result.add(matrix[row][column]);
            }
            down--;
            column++;

            // 从下往上遍历
            for (row = down; row >= up && avoid(up, down, left, right); row--) {
                result.add(matrix[row][column]);
            }
            left++;
            row++;
        }
        return result;
    }

    /**
     * 避免撞墙的条件
     */
    private boolean avoid(int up, int down, int left, int right) {
        return up <= down && left <= right;
    }

}
