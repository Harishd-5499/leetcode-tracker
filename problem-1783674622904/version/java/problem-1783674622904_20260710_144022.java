// Last updated: 7/10/2026, 2:40:22 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy = prices[0];
4        int profit = 0;
5        for (int i = 1; i < prices.length; i++) {
6            if (prices[i] < buy) {
7                buy = prices[i];
8            } else if (prices[i] - buy > profit) {
9                profit = prices[i] - buy;
10            }
11        }
12        return profit;
13    }
14}