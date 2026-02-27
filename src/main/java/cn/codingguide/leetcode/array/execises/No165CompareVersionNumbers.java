package cn.codingguide.leetcode.array.execises;

/**
 * No.165 比较版本号 <a href="https://leetcode.cn/problems/compare-version-numbers/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-06
 */
public class No165CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        String[] version1CharArray = version1.split("\\.");
        String[] version2CharArray = version2.split("\\.");
        int maxLength = Math.max(version1CharArray.length, version2CharArray.length);
        for (int i = 0; i < maxLength; i++) {
            int subVersion1 = i < version1CharArray.length ? Integer.parseInt(version1CharArray[i]) : 0;
            int subVersion2 = i < version2CharArray.length ? Integer.parseInt(version2CharArray[i]) : 0;
            if (subVersion1 != subVersion2) {
                if (subVersion1 > subVersion2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        return 0;
    }

}
