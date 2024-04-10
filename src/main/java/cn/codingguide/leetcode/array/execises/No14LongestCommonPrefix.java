package cn.codingguide.leetcode.array.execises;

/**
 * No14. 最长公共前缀 https://leetcode.cn/problems/longest-common-prefix/description/
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-09
 */
public class No14LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        // 处理特殊情况
        if (strs.length == 1) {
            return strs[0];
        }

        // 第一个元素设置为基准元素
        String baseLine = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (baseLine.isEmpty()) {
                return baseLine;
            }
            if (strs[i].indexOf(baseLine) == 0) {
                continue;
            }
            // 需要与当前元素一直比较下去，两个退出条件，一个是baseLine为空，另外一个是匹配上
            do {
                baseLine = new String(baseLine.toCharArray(), 0, baseLine.length() - 1);
                if (baseLine.isEmpty()) {
                    return baseLine;
                }
            } while (strs[i].indexOf(baseLine) != 0);

        }
        return baseLine;
    }

}
