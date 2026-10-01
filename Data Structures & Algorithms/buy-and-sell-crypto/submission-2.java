class Solution {
    public int maxProfit(int[] prices) {
        
        int max =0;

        int i=0;
        int minPrice = prices[0];

        while (i < prices.length) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > max) {
                max = profit;
            }

            i++;
        }

        return max;
    }
}
