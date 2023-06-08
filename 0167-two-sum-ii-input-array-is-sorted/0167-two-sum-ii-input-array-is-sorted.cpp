class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        unordered_map<int,int>mp;
        vector<int>ans;
        for(int i=0;i<numbers.size();i++){
            int sum=target-numbers[i];
            
            if(mp.find(sum)!=mp.end() ){
                ans.push_back(mp[sum]);
                ans.push_back(i+1);
                
                break;
            }
            else{
                mp[numbers[i]]=i+1;
            }
        }
        return ans;
    }
};