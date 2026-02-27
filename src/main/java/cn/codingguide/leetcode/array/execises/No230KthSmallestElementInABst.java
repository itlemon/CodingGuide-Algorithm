package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * No.230 二叉搜索树中第K小的元素 <a href="https://leetcode.cn/problems/kth-smallest-element-in-a-bst/description/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No230KthSmallestElementInABst {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> valList = new ArrayList<>();
        helper(root, valList);
        return valList.get(k - 1);
    }

    private void helper(TreeNode root, List<Integer> valList) {
        if (root == null) {
            return;
        }

        helper(root.left, valList);
        valList.add(root.val);
        helper(root.right, valList);
    }
}
