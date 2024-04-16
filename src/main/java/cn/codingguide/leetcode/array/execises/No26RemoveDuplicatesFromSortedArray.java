package cn.codingguide.leetcode.array.execises;

/**
 * No26. 删除有序数组中的重复项 <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-16
 */
public class No26RemoveDuplicatesFromSortedArray {

    /**
     * 解法1：中间数组法
     *
     * @param nums 数组
     * @return 新数组长度
     */
    public int removeDuplicates(int[] nums) {
        // 处理特殊情况
        if (nums.length == 1) {
            return 1;
        }

        // 设置一个中间临时数组
        int[] temp = new int[nums.length];
        int tempIndex = 0;
        temp[tempIndex] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > temp[tempIndex]) {
                temp[++tempIndex] = nums[i];
            }
        }

        System.arraycopy(temp, 0, nums, 0, tempIndex + 1);
        return tempIndex + 1;
    }

    public int removeDuplicates2(int[] nums) {
        // 处理特殊情况
        if (nums.length == 1) {
            return 1;
        }

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            // 找到不重复的元素，赋值到数组的开头
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }


}
