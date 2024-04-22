package cn.codingguide.leetcode.array.execises;

/**
 * No66. 加一 <a href="https://leetcode.cn/problems/plus-one/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-22
 */
public class No66PlusOne {

    // [1,2,3] || [1,9,9] || [9,9,9]
    public int[] plusOne(int[] digits) {
        int temp = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + temp;
            temp = 0;
            if (i == digits.length - 1) {
                // 最后一个元素
                digits[i] = digits[i] + 1;
            }
            if (digits[i] == 10) {
                temp = 1;
                digits[i] = 0;
            }
        }

        // 如果遍历完毕后，temp == 1，说明需要在首位再加个拼上一个1
        if (temp == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }

    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        // 能走到这里，说明所有位都是9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

}
