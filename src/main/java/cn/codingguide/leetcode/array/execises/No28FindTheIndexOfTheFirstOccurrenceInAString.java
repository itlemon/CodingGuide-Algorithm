package cn.codingguide.leetcode.array.execises;

/**
 * No.28 找出字符串中第一个匹配项的下标 <a href="https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=string">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-26
 */
public class No28FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        int index = -1;
        if (haystackLen < needleLen) {
            return index;
        }

        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();
        char firstChar = needleCharArray[0];
        
        for (int i = 0; i < haystackLen - needleLen + 1; i++) {
            if (haystackCharArray[i] == firstChar) {
                // 假设找到了，设置index的值
                index = i;
                for (int j = 1; j < needleLen; j++) {
                    if (haystackCharArray[i + j] != needleCharArray[j]) {
                        // 只要有一个字符不对，那么index再次回归为-1
                        index = -1;
                        break;
                    }
                }

                if (index != -1) {
                    return index;
                }
            }
        }

        return index;
    }

}
