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
                rem+=k;//this is done because we want to make sure that the remainder remains positive like fo rcase such as [-1,2,9],k=2...we will get output as 1 if we take the neg number and proceed further so we need to make sure that we are making our remainder positive
            }
            if(rem==0)count++;
            if(mp.find(rem)!=mp.end())count+=mp[rem];
        mp[rem]++;
        j++;
        }
      return count;  
    }
    
};