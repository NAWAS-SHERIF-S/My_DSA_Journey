class Solution {
    public int maxProfit(int[] prices) {
        // Initialize the minimum price to the first day's price
        int minPrice = prices[0];

        // Initialize maxProfit to 0 (no profit made yet)
        int maxProfit = 0;

        // Loop through each day's price
        for (int i = 0; i < prices.length; i++) {
            // If the current price is lower than the minimum seen so far, update minPrice
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else {
                // Calculate the profit if selling today and update maxProfit if it's higher
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        // Return the maximum profit possible
        return maxProfit;
    }
}
