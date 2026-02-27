package cn.codingguide.leetcode.array.execises;

import java.util.Arrays;

/**
 * No.x 字节面试题-版本号排序
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-06
 */
public class NoxVersionsSort {

    public static void main(String[] args) {
        String[] versions = {"1.7.1","1.7.6","1.5","1.45","3.2","2.11.1","1.0.0.4"};
        Arrays.sort(versions, (a, b) -> {
            String[] v1 = a.split("\\.");
            String[] v2 = b.split("\\.");
            int len = Math.max(v1.length, v2.length);
            for (int i = 0; i < len; i++) {
                int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
                int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
                if (num1 != num2) {
                    return num1 - num2;
                }
            }
            return 0;
        });
        System.out.println(Arrays.toString(versions));
    }

}
