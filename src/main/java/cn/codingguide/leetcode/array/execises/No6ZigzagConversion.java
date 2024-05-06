package cn.codingguide.leetcode.array.execises;

import java.util.Arrays;

/**
 * No6. Z 字形变换 <a href="https://leetcode.cn/problems/zigzag-conversion/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-05-06
 */
public class No6ZigzagConversion {

    public String convert(String s, int numRows) {
        // 处理特殊情况
        if (numRows == 1) {
            return s;
        }

        String[] temp = new String[numRows];
        Arrays.fill(temp, "");
        char[] charArray = s.toCharArray();
        // 周期确定很重要，可以找几个案例看下，它的周期是2(numRows-1)，比如，numRows=3的时候，周期就是4，每4个为一轮
        int period = 2 * (numRows - 1);
        for (int i = 0; i < charArray.length; i++) {
            int mod = i % period;
            if (mod < numRows) {
                temp[mod] += charArray[i];
            } else {
                temp[period - mod] += charArray[i];
            }
        }

        StringBuilder result = new StringBuilder();
        for (String item : temp) {
            result.append(item);
        }
        return result.toString();
    }
}
