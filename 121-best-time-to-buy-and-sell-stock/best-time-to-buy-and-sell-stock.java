class Solution {
    public int maxProfit(int[] price) {
        int Maxprofit = 0;
        int Minprice = Integer.MAX_VALUE;

        for(int i = 0; i < price.length; i++){
            if(price[i] < Minprice){
                Minprice = price[i];
            }else if(price[i] - Minprice > Maxprofit){
                Maxprofit = price[i] - Minprice;
            }
        }
        return Maxprofit;
    }
}