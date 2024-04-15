package cn.codingguide.leetcode.array.execises;

/**
 * No.374 猜数字大小： <a href="https://leetcode.cn/problems/guess-number-higher-or-lower/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-10-30
 */
public class No374GuessNumberHigherOrLower {

    /**
     * 解法1
     *
     * @param n 数组的最大值
     * @return 目标元素
     */
    public int guessNumber(int n) {
        // 定义三个变量，它们分别是待搜索区间的左边界、右边界及中间值下标
        int left = 0;
        int right = n - 1;
        int mid;

        // 退出循环的条件是 left == right，此时说明待搜索区间只剩下一个元素，一定就是目标元素
        while (left < right) {
            mid = left + (right - left) / 2;
            // 中间值
            int midValue = mid + 1;
            if (guess(midValue) == 0) {
                // 猜对了，直接返回中间值
                return midValue;
            } else if (guess(midValue) < 0) {
                // 猜大了，说明目标值在区间[left, mid - 1]这个区间内
                right = mid - 1;
            } else {
                // 猜小了，说明目标值在区间[mid + 1, right]这个区间内
                left = mid + 1;
            }
        }

        // 能走到这里，此时说明待搜索区间只剩下一个元素，一定就是目标元素
        return left + 1;
    }

    /**
     * 解法1
     *
     * @param n 数组的最大值
     * @return 目标元素
     */
    public int guessNumber2(int n) {
        // 定义三个变量，这里简单认为数组的下标从1开始，它们分别是待搜索区间的左边界、右边界及中间值下标
        int left = 1;
        int right = n;
        int mid;

        // 退出循环的条件是 left == right，此时说明待搜索区间只剩下一个元素，一定就是目标元素
        while (left < right) {
            mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                // 猜对了，直接返回中间值
                return mid;
            } else if (guess(mid) < 0) {
                // 猜大了，说明目标值在区间[left, mid - 1]这个区间内
                right = mid - 1;
            } else {
                // 猜小了，说明目标值在区间[mid + 1, right]这个区间内
                left = mid + 1;
            }
        }

        // 能走到这里，此时说明待搜索区间只剩下一个元素，一定就是目标元素
        return left;
    }

    /**
     * 这个方法是leetcode内置定义的，这里加上是为了防止编译出错，具体方法体不作处理
     *
     * @param num 猜的值
     * @return 猜对了返回0，猜大了返回-1，猜小了返回1
     */
    private int guess(int num) {
        return 0;
    }

}
