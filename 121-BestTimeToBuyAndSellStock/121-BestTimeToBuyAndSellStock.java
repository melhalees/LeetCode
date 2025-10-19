// Last updated: 10/19/2025, 4:58:58 AM
class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        if (n == 1) return 0;

        int buyPointer = 0;
        int sellPointer = 1;
        int maxProfit = 0;

        while (sellPointer < n) {
            if (prices[sellPointer] > prices[buyPointer]) {
                maxProfit = Math.max(maxProfit, prices[sellPointer] - prices[buyPointer]);
            } else {
                buyPointer = sellPointer;
            }
            sellPointer++;
        }
        return maxProfit;
    }
}