package cn.codingguide.leetcode.array.execises;

/**
 * No.69 x 的平方根： <a href="https://leetcode.cn/problems/sqrtx/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2023-05-28
 */
public class No69SqrtX {

    public int mySqrt(int x) {
        // 定义三个变量，它们分别是左右边界及中间值的下标，由于x有可能为0，所以设置右边界下标为x
        // 这样组成的数组可以理解为[0, 1, 2, ..., x]
        int left = 0;
        int right = x;
        int mid;

        // 定一个变量ans，用来记录x的平方根整数部分值，它存在这样的关系：ans^2 <= x
        int ans = 0;

        while (left <= right) {
            // 这么计算mid，是防止整型溢出，因为x的取值范围是：0 <= x <= 2^31 - 1
            mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

}
