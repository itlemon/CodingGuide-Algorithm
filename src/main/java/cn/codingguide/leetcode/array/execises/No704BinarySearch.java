package cn.codingguide.leetcode.array.execises;

/**
 * No.704 二分查找：<a href="https://leetcode.cn/problems/binary-search/">链接</a>
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

    /**
     * 主动找的思路：左闭右开
     *
     * @param nums 待查找的数组
     * @param target 目标元素
     * @return 下标或者-1
     */
    public int search3(int[] nums, int target) {
        // 定义三个变量
        int left = 0;
        int right = nums.length;
        int mid;

        // 跳出循环的条件是 left == right，当left = right - 1的时候，是最后一次循环，此时待查找区间只剩下一个元素
        // 如果最后一个元素不等于目标元素，说明数组nums里面不含目标元素，直接返回 -1
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                // 右边是单开，所以只能是mid，不是mid - 1
                right = mid;
            }
        }

        // 如果不存在目标元素，直接返回-1
        return -1;
    }

    /**
     * 主动找的思路：左闭右闭
     *
     * @param nums 待查找的数组
     * @param target 目标元素
     * @return 下标或者-1
     */
    public int search4(int[] nums, int target) {
        // 定义三个变量
        int left = 0;
        int right = nums.length - 1;
        int mid;

        // 跳出循环的条件是 left == right，当left = right - 1的时候，是最后一次循环，此时待查找区间只剩下两个元素
        // 检查完 right - 1 的元素后，就跳出了，少检查了一个 right的元素，也就是这种判断条件在循环体中漏掉了一个元素
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 最后还要检查循环体没有检查的元素才能得出正确结果
        return nums[left] == target ? left : -1;
    }

    /**
     * 排除法的思路：左闭右闭
     *
     * @param nums 待查找的数组
     * @param target 目标元素
     * @return 下标或者-1
     */
    public int search5(int[] nums, int target) {
        // 定义三个变量
        int left = 0;
        int right = nums.length - 1;
        int mid;

        // 跳出循环的条件是 left == right，当 left = right - 1 的时候，是最后一次循环，此时待查找区间只剩下两个元素
        // 检查完 right - 1 的元素后，就跳出了，少检查了一个 right的元素，也就是这种判断条件在循环体中漏掉了一个元素
        while (left < right) {
            mid = (left + right) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // 最后还要检查循环体没有检查的元素才能得出正确结果
        return nums[left] == target ? left : -1;
    }
}
