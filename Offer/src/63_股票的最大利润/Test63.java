/**
 * 可以有一次买入和一次卖出，那么买入必须在前。求最大收益。
 * 思想：贪心思想，假设第 i 轮进行卖出操作，买入操作价格应该在 i 之前并且价格最低。
 */

class Test63 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Solution63 solution63 = new Solution63();
        System.out.println(solution63.maxProfit(prices));
    }
}

class Solution63 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int soFarMin = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            soFarMin = Math.min(soFarMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - soFarMin);
        }
        return maxProfit;
    }
}