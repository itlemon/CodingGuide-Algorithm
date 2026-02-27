package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * No.144 二叉树的前序遍历 <a href="https://leetcode.cn/problems/binary-tree-preorder-traversal/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No144BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }

}
