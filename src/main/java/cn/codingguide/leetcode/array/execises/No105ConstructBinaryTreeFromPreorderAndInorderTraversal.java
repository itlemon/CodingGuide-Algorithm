package cn.codingguide.leetcode.array.execises;

import cn.codingguide.leetcode.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * No.105 从前序与中序遍历序列构造二叉树 <a href="https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/?envType=study-plan-v2&envId=top-100-liked">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2026-02-04
 */
public class No105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode buildTreeHelper(int[] preorder, int ps, int pe, int[] inorder, int is, int ie, Map<Integer, Integer> map) {
        // 终止条件
        if (ps > pe || is > ie) {
            return null;
        }

        // 递归本层次需要做的事情
        // 获取根节点
        TreeNode root = new TreeNode(preorder[ps]);
        // 获取根节点在中序遍历结果序列中的位置
        int ri = map.get(preorder[ps]);
        // 确定左子树的数量，从而可以从前序遍历中找到左子树和右子树
        int leftChildTreeNodeNum = ri - is;

        // 递归过程
        root.left = buildTreeHelper(preorder, ps + 1, ps + leftChildTreeNodeNum, inorder, is, ri - 1, map);
        root.right = buildTreeHelper(preorder, ps + leftChildTreeNodeNum + 1, pe, inorder, ri + 1, ie, map);
        return root;
    }

}
