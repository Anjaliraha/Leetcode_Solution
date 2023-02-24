class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int j=0,count=0;
        vector<int>presum(nums.size(),0);
        unordered_map<int,int>mp;
        int sum=0;
        int rem=0;
        
        
        while(j<nums.size()){
            sum+=nums[j];
            rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(rem==0)count++;
            if(mp.find(rem)!=mp.end())count+=mp[rem];
        mp[rem]++;
        j++;
        }
      return count;  
    }
    
};