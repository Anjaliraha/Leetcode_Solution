class Solution
{
public:
    int subarraySum(vector<int> &nums, int k)
    {
        int n = nums.size();
        int count = 0, i = 0, j = 0;
        unordered_map<int, int> mp;
        int sum=0;
        mp[0]=1;//suppose mere paas ek array={4,5,6,7,8,-1,9} aur k =4 hai toh agar mai mp[0]=1 nhi karti hu aur sum calculate hu jo ki hai aayega sum = sum+num[0]=0+4=4 aur sum -k=4-4=0 toh kyuki 0 mere unordered map mai nhi hai toh iska count save nhi hoga aur hamara count galat ho jayega isliye hum mp[0]=1 kiye hai.
        
    while (j < nums.size())
        {
            sum=sum+nums[j];
            if(mp.find(sum-k)!=mp.end()){
                count+=mp[sum-k];
            }
            mp[sum]++;
            j++;
        }
        return count;
    }
};