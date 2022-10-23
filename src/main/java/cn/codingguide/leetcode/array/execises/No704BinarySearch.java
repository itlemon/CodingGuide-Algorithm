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

}
