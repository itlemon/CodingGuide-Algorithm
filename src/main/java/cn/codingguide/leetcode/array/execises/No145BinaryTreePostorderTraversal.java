package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * No.145 二叉树的后序遍历 <a href="https://leetcode.cn/problems/binary-tree-postorder-traversal/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No145BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        helper(root.left, res);
        helper(root.right, res);
        res.add(root.val);
    }

}
