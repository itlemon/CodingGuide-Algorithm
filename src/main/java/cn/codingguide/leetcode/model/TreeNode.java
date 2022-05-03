package cn.codingguide.leetcode.model;

/**
 * 二叉树节点类型
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-05-03
 */
public class TreeNode {

    /**
     * 值
     */
    public int val;

    /**
     * 左节点指针
     */
    public TreeNode left;

    /**
     * 右节点指针
     */
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
