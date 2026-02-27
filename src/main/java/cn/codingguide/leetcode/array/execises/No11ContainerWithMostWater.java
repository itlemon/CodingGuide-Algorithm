package cn.codingguide.leetcode.array.execises;

/**
 * No.11 盛最多水的容器 <a href="https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-05
 */
public class No11ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return max;
    }

}
