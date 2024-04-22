package cn.codingguide.leetcode.array.execises;

/**
 * No283. 移动零 <a href="https://leetcode.cn/problems/move-zeroes/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-22
 */
public class No283MoveZeroes {

    // [0,1,0,3,12]
    public void moveZeroes(int[] nums) {
        // 处理特殊情况
        if (nums.length == 1) {
            return;
        }

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] == 0) {
                if (nums[i] != 0) {
                    // 交换
                    nums[index++] = nums[i];
                    nums[i] = 0;
                }
            } else {
                index++;
            }
        }
    }

}
