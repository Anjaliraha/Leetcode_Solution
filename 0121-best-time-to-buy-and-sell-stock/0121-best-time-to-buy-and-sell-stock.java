class Solution {
    public int maxProfit(int[] prices) {
       // int max_price=Integer.MIN_VALUE;
        int min_price=prices[0];
      //  int index=0;
        int max_profit=0;
        //7 1 5 3 6 4
        //0 1 2 3 4 5
 //min    7 1 1 1 1
// max      0 4 4 5
        
        //2 4 1
        for(int i=1;i<prices.length;i++){
            if(min_price>prices[i]){
                   min_price=prices[i];
            }
            else{

                max_profit=Math.max(prices[i]-min_price,max_profit);
            }
            
         
       
    }
           return max_profit;
    }
}