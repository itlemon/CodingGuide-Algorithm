package cn.codingguide.leetcode.array.execises;

/**
 * No27. 移除元素 <a href="https://leetcode.cn/problems/remove-element/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-16
 */
public class No27RemoveElement {

    /**
     * 双指针法
     *
     * @param nums 数组
     * @param val  待移除的元素
     * @return 新数组长度
     */
    public int removeElement(int[] nums, int val) {
        // 处理特殊情况
        if (nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == val) {
                if (nums[end] != val) {
                    nums[start] = nums[end];
                    start++;
                }
                end--;
            } else {
                start++;
            }
        }

        // 返回长度
        return end + 1;
    }


}
