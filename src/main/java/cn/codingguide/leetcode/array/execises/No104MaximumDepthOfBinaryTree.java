package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

/**
 * No.104 二叉树的最大深度 <a href="https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No104MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }


}
