class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            if (prices[i-1] < minBuy) {
                minBuy = prices[i-1];
            }
            profit = sell-minBuy > profit ? sell-minBuy : profit;
        }
        return profit;
    }
}
