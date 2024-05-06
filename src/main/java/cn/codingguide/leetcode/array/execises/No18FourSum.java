package cn.codingguide.leetcode.array.execises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * No18. 四数之和 <a href="https://leetcode.cn/problems/4sum/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-24
 */
public class No18FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return nSum(nums, 4, 0, target);
    }

    /**
     * 递归法
     *
     * @param nums   数组
     * @param n      n数之和
     * @param start  开始索引
     * @param target 目标和
     */
    private List<List<Integer>> nSum(int[] nums, int n, int start, int target) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        // 递归的结束条件
        if (n < 2 || length < n) {
            return result;
        }

        if (n == 2) {
            // 转化为2Sum问题
            int left = start;
            int right = length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(new ArrayList<>(Arrays.asList(nums[left], nums[right])));
                    // 过滤掉重复项
                    while (left < right && nums[left] == nums[++left]) {
                    }
                    while (left < right && nums[right] == nums[--right]) {
                    }
                } else if (sum > target) {
                    while (left < right && nums[right] == nums[--right]) {
                    }
                } else {
                    while (left < right && nums[left] == nums[++left]) {
                    }
                }
            }
        } else {
            // nSum问题，n>2时，递归计算(n - 1)Sum问题
            for (int i = start; i < length; i++) {
                List<List<Integer>> itemResult = nSum(nums, n - 1, i + 1, target - nums[i]);
                for (List<Integer> item : itemResult) {
                    item.add(nums[i]);
                    result.add(item);
                }
                // 过滤重复项
                while (i < length - 1 && nums[i] == nums[i + 1]) {
                    // 如果这里的条件不满足，那么就交由外部的i++进行自增
                    i++;
                }
            }
        }

        return result;
    }

}
