package cn.codingguide.leetcode.array.examples;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-05-15
 */
public class ArrayExample {

    public static void main(String[] args) {
        char[] helloWorld = new char[] {'H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D'};
        // 直接访问已知的位置的元素
        System.out.println(helloWorld[4]);
        // 访问未知位置的第一个'O'元素
        for (int i = 0; i < helloWorld.length; i++) {
            if ('O' == helloWorld[i]) {
                System.out.println('O');
                break;
            }
        }
    }


}
