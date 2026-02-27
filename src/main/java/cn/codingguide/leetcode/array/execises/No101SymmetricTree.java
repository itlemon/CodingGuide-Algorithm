package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

/**
 * No.101 对称二叉树 <a href="https://leetcode.cn/problems/symmetric-tree/description/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No101SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && helper(p.left, q.right) && helper(p.right, q.left);
    }

}
