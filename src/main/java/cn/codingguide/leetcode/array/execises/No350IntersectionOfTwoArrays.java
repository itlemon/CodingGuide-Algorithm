package cn.codingguide.leetcode.array.execises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350. 两个数组的交集 II https://leetcode.cn/problems/intersection-of-two-arrays-ii/description/
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-08
 */
public class No350IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                Integer count = map.get(num);
                if (count == 1) {
                    map.remove(num);
                } else {
                    map.put(num, count - 1);
                }
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
