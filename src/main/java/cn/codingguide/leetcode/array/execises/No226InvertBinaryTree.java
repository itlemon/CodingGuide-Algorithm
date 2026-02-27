package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

/**
 * No.226 翻转二叉树 <a href="https://leetcode.cn/problems/invert-binary-tree/description/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No226InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        helper(left);
        helper(right);
    }

}
