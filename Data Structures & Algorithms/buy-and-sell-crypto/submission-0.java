class Solution {
    public int maxProfit(int[] prices) {
        
        int low=prices[0];
        int profit =0;

        for(int max:prices)
        {
            profit= Math.max(profit,max-low);
            low = Math.min(low,max);
        }
        return profit;
    }
}
