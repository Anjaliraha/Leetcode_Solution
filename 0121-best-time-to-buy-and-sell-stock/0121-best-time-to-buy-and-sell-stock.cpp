class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit=0,buy=prices[0],index=0;
        for(int i=1;i<prices.size();i++){
            if(buy>prices[i]){
                buy=prices[i];
                index=i;
            }
            profit=max(profit,prices[i]-prices[index]);
        }
        return profit;
    }
};