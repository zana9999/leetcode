/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        
        int minPriceSoFar = prices[0];
        int maxProfit =0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPriceSoFar ){
                minPriceSoFar = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPriceSoFar);
            }
        }

        return maxProfit;

    }
}
// @lc code=end

