class Solution
{
public:
    int subarraySum(vector<int> &nums, int k)
    {
        int n = nums.size();
        int count = 0, j = 0;
        unordered_map<int, int> mp;
        vector<int>presum(nums.size(),0);
        presum[0]=nums[0];
       // int presum=0;
        for(int i=1;i<nums.size();i++){
            presum[i]=nums[i]+presum[i-1];
        }
    while (j < nums.size())
        {
            if(presum[j]==k)count++;
            //sum=sum+nums[j];
            if(mp.find(presum[j]-k)!=mp.end()){
                count+=mp[presum[j]-k];
            }
            mp[presum[j]]++;
            j++;
        }
        return count;
    }
};