class Solution {
    public int maxProfit(int[] prices) {
        int currMin = Integer.MAX_VALUE, currMaxProfit = 0;
        
        for (Integer price: prices) {
            if (price < currMin) {
                currMin = price;
            }
            else if ((price - currMin) > currMaxProfit) {
                currMaxProfit = price - currMin;
            }
        } //for
        return currMaxProfit;
    }
}