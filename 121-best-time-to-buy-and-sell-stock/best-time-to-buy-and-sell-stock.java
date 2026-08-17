class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int profit = 0;
        int buy = prices[0];
        int i = 1;
        while (i < prices.length) {
            if (prices[i] < buy) {
                buy = prices[i++];
                continue;
            }
            profit = Math.max(profit, prices[i] - buy);
            i++;
        }
        System.gc();
        return profit;
    }
}