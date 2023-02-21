class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit=0,buy=INT_MAX;
        for(int i=0;i<prices.size();i++){
            if(buy>prices[i]){
                buy=prices[i];
                //index=i;
            }
            profit=max(profit,prices[i]-buy);
        }
        return profit;
    }
};