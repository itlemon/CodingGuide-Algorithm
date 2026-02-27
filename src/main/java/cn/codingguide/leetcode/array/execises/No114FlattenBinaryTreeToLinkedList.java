package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * No.114 二叉树展开为链表 <a href="https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/description/?envType=study-plan-v2&envId=top-100-liked">链路</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No114FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preOrder(root, list);
        int size = list.size();
        TreeNode cur;
        if (size > 1) {
            cur = list.get(0);
            for (int i = 1; i < size; i++) {
                cur.left = null;
                cur.right = list.get(i);
                cur = list.get(i);
            }
        }
    }

    private void preOrder(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

}
