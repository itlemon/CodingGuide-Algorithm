package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

/**
 * No.543 二叉树的直径 <a href="https://leetcode.cn/problems/diameter-of-binary-tree/description/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No543DiameterOfBinaryTree {

    private int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        maxDepth(root);
        return ans - 1;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 左儿子为根的子树的深度
        int left = maxDepth(root.left);
        // 右儿子为根的子树的深度
        int right = maxDepth(root.right);
        // 将每个节点最大直径(左子树深度+右子树深度+1)当前最大值比较并取大者
        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;
    }

}
