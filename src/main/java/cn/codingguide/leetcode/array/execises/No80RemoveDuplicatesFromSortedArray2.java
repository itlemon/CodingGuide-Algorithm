package cn.codingguide.leetcode.array.execises;

/**
 * No80. 删除有序数组中的重复项 II <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-17
 */
public class No80RemoveDuplicatesFromSortedArray2 {

    //[1,1,1,1,2,2,3]
    public int removeDuplicates(int[] nums) {
        // 处理特殊情况
        if (nums.length == 1) {
            return 1;
        }

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                if (index >= 1 && nums[index - 1] == nums[index]) {
                    // 判断前一位和当前index位是否一样，一样就不做任何事情
                } else {
                    nums[++index] = nums[i];
                }
            } else {
                nums[++index] = nums[i];
            }
        }

        return index + 1;
    }

}
