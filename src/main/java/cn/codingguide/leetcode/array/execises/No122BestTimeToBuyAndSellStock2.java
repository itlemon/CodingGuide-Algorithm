package cn.codingguide.leetcode.array.execises;

/**
 * No.122. 买卖股票的最佳时机 II <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/description/">链接</a>
 *
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-04-10
 */
public class No122BestTimeToBuyAndSellStock2 {

    /**
     * 贪心，0ms
     */
    public int maxProfit(int[] prices) {
        // 处理特殊情况
        if (prices.length == 1) {
            return 0;
        }

        int profit = 0;
        int bidPrice = prices[0];
        int sellingPrice;
        for (int i = 1; i < prices.length; ) {
            sellingPrice = prices[i];
            i++;
            if (sellingPrice <= bidPrice) {
                bidPrice = sellingPrice;
            } else {
                // 这里需要找到一直递增的最大值
                while (i < prices.length && prices[i] >= sellingPrice) {
                    sellingPrice = prices[i];
                    i++;
                }
                profit += sellingPrice - bidPrice;
                if (i >= prices.length) {
                    break;
                }
                bidPrice = prices[i];
                i++;
            }
        }

        return profit;
    }

    /**
     * 贪心，1ms
     */
    public int maxProfit2(int[] prices) {
        int length = prices.length;
        // 处理特殊情况
        if (length == 1) {
            return 0;
        }

        // 定义结果
        int result = 0;
        int sum = 0;
        for (int i = 0; i < length - 1; i++) {
            if (prices[i] <= prices[i + 1]) {
                sum += (prices[i + 1] - prices[i]);
                if (i == length - 2) {
                    // 说明遍历到了最后
                    result += sum;
                }
            } else {
                // 出现价格下降，这里就卖出，并设置sum为0，重新开始计算利润
                result += sum;
                sum = 0;
            }
        }
        return result;
    }

}
