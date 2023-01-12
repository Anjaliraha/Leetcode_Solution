class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int>ans;
        unordered_map<int,int>mp;
        // for(int i=0;i<nums.size();i++){
        //     mp.insert(make_pair(nums[i],i));
        // }
        for (int i=0;i<nums.size();i++){
            int temp=target-nums[i];
            if(mp.find(temp)!=mp.end() and mp[temp]!=i){
                ans.push_back(i);
                ans.push_back(mp[temp]);
                break;
            }
            mp[nums[i]]=i;
        }
        return ans;
    }
    
};