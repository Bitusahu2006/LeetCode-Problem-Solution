class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int p = 1; p< prices.length; p++) {
            if (prices[p] > prices[p - 1]) {
                profit += prices[p] - prices[p - 1];
            }
        }

        return profit;
    }
}