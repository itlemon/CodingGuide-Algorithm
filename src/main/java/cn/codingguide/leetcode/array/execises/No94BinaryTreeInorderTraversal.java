package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * No.94 二叉树的中序遍历 <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No94BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
    }

}
