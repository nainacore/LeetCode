class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minBuy=prices[0];
        int maxProfit=0;
        for(int i=0;i<n;i++){
            minBuy=Math.min(minBuy,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minBuy);
        }
        return maxProfit;
    }
}