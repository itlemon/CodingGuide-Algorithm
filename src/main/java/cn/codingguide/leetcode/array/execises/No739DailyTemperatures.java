package cn.codingguide.leetcode.array.execises;

import java.util.Stack;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-05
 */
public class No739DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] res = new int[length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int top = stack.pop();
                res[top] = i - top;
            }
            stack.push(i);
        }

        return res;
    }

}
