class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        //basecase

        int curr = prices[0], max = 0;

        for(int i=1;i<n;i++){
            curr = Math.min(curr, prices[i]);
            max = Math.max(max, prices[i] - curr);
        }
        return max;
    }
}
