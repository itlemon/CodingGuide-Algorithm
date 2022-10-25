package cn.codingguide.leetcode.array.execises;

/**
 * No.704 二分查找：https://leetcode.cn/problems/binary-search/
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-10-23
 */
public class No704BinarySearch {

    /**
     * 暴力遍历法
     *
     * @param nums 待查找的数组
     * @param target 目标元素
     * @return 下标或者-1
     */
    public int search1(int[] nums, int target) {
        // 对每一个元素进行遍历
        for (int i = 0; i < nums.length; i++) {
            // 如果数组中某个元素等于目标元素，则直接返回元素下标
            if (target == nums[i]) {
                return i;
            }
        }

        // 如果不存在目标元素，直接返回-1
        return -1;
    }

    /**
     * 主动找的思路
     *
     * @param nums 待查找的数组
     * @param target 目标元素
     * @return 下标或者-1
     */
    public int search2(int[] nums, int target) {
        // 定义三个变量
        int left = 0;
        int right = nums.length - 1;
        int mid;

        // 跳出循环的条件是 left > right，当left == right的时候，是最后一次循环，此时待查找区间只剩下一个元素
        // 如果最后一个元素不等于目标元素，说明数组nums里面不含目标元素，直接返回 -1
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 如果不存在目标元素，直接返回-1
        return -1;
    }

}
