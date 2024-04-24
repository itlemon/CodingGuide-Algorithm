package cn.codingguide.leetcode.array.execises;

import java.util.HashMap;
import java.util.Map;

/**
 * No1. 两数之和 <a href="https://leetcode.cn/problems/two-sum/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-24
 */
public class No1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(target - nums[i])) {
                return new int[]{table.get(target - nums[i]), i};
            }
            table.put(nums[i], i);
        }

        return new int[0];
    }

}
