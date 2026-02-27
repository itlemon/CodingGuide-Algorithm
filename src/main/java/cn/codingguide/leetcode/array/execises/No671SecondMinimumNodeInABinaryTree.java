package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

/**
 * No.671 二叉树中第二小的节点 <a href="https://leetcode.cn/problems/second-minimum-node-in-a-binary-tree/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No671SecondMinimumNodeInABinaryTree {

    private int ans;
    private int rootVal;

    public int findSecondMinimumValue(TreeNode root) {
        ans = -1;
        // 根据题意，rootVal一定是最小的那一个，现在只需要找到第二小即可
        rootVal = root.val;
        bfs(root);
        return ans;
    }

    private void bfs(TreeNode root) {
        if (root == null) {
            return;
        }

        // 这里排除掉大于ans的，只能往小的范围搜索
        if (ans != -1 && root.val >= ans) {
            return;
        }

        if (root.val > rootVal) {
            ans = root.val;
        }

        bfs(root.left);
        bfs(root.right);

    }

}
