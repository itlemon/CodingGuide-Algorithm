package cn.codingguide.leetcode.array.execises;

/**
 * No.35 搜索插入位置 https://leetcode.cn/problems/search-insert-position/
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-10-30
 */
public class No35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        // 定义三个变量，它们分别是左右边界及中间值的下标
        int left = 0;
        int right = nums.length - 1;
        int mid;

        // 退出循环的条件是 left == right + 1，最后一次循环的时候，left == right，
        // 如果此时还没有找到目标元素，说明原数组中没有目标元素，根据题意需要在数组中
        // 插入目标元素，并返回目标元素的下标，假设目标元素target < nums[mid]，
        // 那么需要在nums[mid]左边插入target，此时target下标就是mid，而此时left == mid，
        // 直接返回left；假设目标元素target > nums[mid]，那么需要在nums[mid]右边插入target，
        // 此时target的下标就是mid + 1，而此时left == mid + 1，所以最后直接返回left
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
