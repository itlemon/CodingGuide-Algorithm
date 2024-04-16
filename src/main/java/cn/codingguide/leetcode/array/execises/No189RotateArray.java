package cn.codingguide.leetcode.array.execises;

/**
 * No189. 轮转数组 <a href="https://leetcode.cn/problems/rotate-array/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-15
 */
public class No189RotateArray {

    /**
     * 解法1：使用额外的数组
     *
     * @param nums 数组
     * @param k    k个位置
     */
    public void rotate(int[] nums, int k) {
        // 处理特殊情况
        int length = nums.length;
        if (length == 1 || k == 0) {
            return;
        }

        // 使用新的数组
        int[] newNums = new int[length];
        for (int i = 0; i < length; i++) {
            newNums[(i + k) % length] = nums[i];
        }

        // 拷贝到原数组
        System.arraycopy(newNums, 0, nums, 0, newNums.length);
    }

    /**
     * 解法2：三次数组翻转
     *
     * @param nums 数组
     * @param k    k个位置
     */
    public void rotate2(int[] nums, int k) {
        // 处理特殊情况
        int length = nums.length;
        if (length == 1 || k == 0) {
            return;
        }

        // 三次翻转
        // 1.全量翻转
        reverse(nums, 0, length - 1);
        // 2.翻转前半部分
        reverse(nums, 0, k % length - 1);
        // 3.翻转后半部分
        reverse(nums, k % length, length - 1);
    }

    /**
     * 翻转数组
     *
     * @param nums  数组
     * @param start 开始索引(含)
     * @param end   结束索引(含)
     */
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}