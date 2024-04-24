package cn.codingguide.leetcode.array.execises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * No15. 三数之和 <a href="https://leetcode.cn/problems/3sum/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-24
 */
public class No153ThreeSum {

    // [-4,-1,-1,0,1,2]
    public List<List<Integer>> threeSum(int[] nums) {
        // 排序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // 目标数只到倒数第三位，后面要留两位，不必进行多余遍历
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                // 当定位到目标元素大于0的时候，后面的数不用再遍历了，因为后面的数一定都大于0
                break;
            }

            // 目标数跳过已经定位的重复数
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            // 初始化指针
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    // 这里要注意需要跳过重复项
                    while (left < right && nums[left] == nums[++left]) {
                    }
                    while (left < right && nums[right] == nums[--right]) {
                    }
                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }

}
