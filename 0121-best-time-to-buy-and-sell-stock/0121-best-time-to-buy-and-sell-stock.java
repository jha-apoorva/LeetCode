class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int curr = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            curr = prices[i] - min;
            if(curr>profit){
                profit = curr;
            }
        }
        return profit;
    }
}