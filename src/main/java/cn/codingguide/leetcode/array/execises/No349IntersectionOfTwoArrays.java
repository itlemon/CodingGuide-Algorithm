package cn.codingguide.leetcode.array.execises;

import java.util.*;

/**
 * 349. 两个数组的交集 <a href="https://leetcode.cn/problems/intersection-of-two-arrays/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-08
 */
public class No349IntersectionOfTwoArrays {

    /**
     * Set集合法
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    /**
     * 排序+双指针法
     */
    public int[] intersection2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int index1 = 0, index2 = 0, length1 = nums1.length, length2 = nums2.length;
        int[] temp = new int[length1 + length2];
        int tempIndex = 0;
        int tempPre = -1;
        while (index1 < length1 && index2 < length2) {
            int num1 =  nums1[index1];
            int num2 =  nums2[index2];
            if (num1 == num2) {
                if (tempPre != num1) {
                    temp[tempIndex++] = num1;
                    tempPre = num1;
                }
                index1++;
                index2++;
            } else if (num1 < num2) {
                index1++;
            } else {
                index2++;
            }
        }

        return Arrays.copyOfRange(temp, 0, tempIndex);
    }

}
