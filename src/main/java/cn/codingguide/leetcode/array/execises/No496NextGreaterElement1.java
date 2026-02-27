package cn.codingguide.leetcode.array.execises;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-05
 */
public class No496NextGreaterElement1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 先找出nums1元素在nums2中的下表位置，然后给nums2去做下一个元素的计算，然后直接取数即可
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int num : nums1) {
            for (int i = 0; i < nums2.length; i++) {
                if (num == nums2[i]) {
                    indexMap.put(num, i);
                }
            }
        }

        // 计算下一个最大元素
        int[] nextGreaterArr = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            nextGreaterArr[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGreaterArr[indexMap.get(nums1[i])];
        }

        return res;
    }

}
