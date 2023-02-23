class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
       vector<int>ans;
        unordered_map<int,int>mp;
        int n=nums.size();
        int s=(n/3)+1;
        for(int i=0;i<n;i++){
            mp[nums[i]]++;
        }
        for(auto x:mp){
            //cout<<x.first<<"->"<<x.second<<endl;
            if(x.second>=s){
                ans.push_back(x.first);
            }
        }
        return ans;
    }
};