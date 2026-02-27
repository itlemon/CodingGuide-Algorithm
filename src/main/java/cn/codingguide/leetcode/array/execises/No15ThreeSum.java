package cn.codingguide.leetcode.array.execises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * No15. 三数之和 <a href="https://leetcode.cn/problems/3sum/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-05
 */
public class No15ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    while (j < k && nums[k] == nums[--k]) {
                    }
                } else if (sum < 0) {
                    while (j < k && nums[j] == nums[++j]) {
                    }
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[k] == nums[--k]) {
                    }
                    while (j < k && nums[j] == nums[++j]) {
                    }
                }
            }
        }
        return res;
    }

}
