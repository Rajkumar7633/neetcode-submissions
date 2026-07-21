class Solution {
    public int maxProfit(int[] prices) {
        int minPr = prices[0];
        int maxP = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i] < minPr){
                minPr = prices[i];
            }
            maxP = Math.max(maxP, prices[i] - minPr);
        }
        return maxP;
    }
}
