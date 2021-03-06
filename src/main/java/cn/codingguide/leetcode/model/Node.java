package cn.codingguide.leetcode.model;

import java.util.List;

/**
 * N叉树模型
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-05-03
 */
public class Node {

    public int val;

    public List<Node> children;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", children=" + children +
                '}';
    }
}
