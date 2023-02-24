class Solution {
public:
    int lengthOfLongestSubstring(string nums) {
        unordered_map<char,int>mp;
        int n=nums.length();
        int i=0,j=0;
        int ans=INT_MIN;
        if(n==0)return 0;
        while(j<n){
            mp[nums[j]]++;
            if(mp.size()==j-i+1){
                ans=max(ans,j-i+1);
                j++;
            }
            else if(mp.size()<j-i+1){
                while(mp.size()<j-i+1){
                      mp[nums[i]]--;
                        if(mp[nums[i]]==0)mp.erase(nums[i]);
                      i++;
                }
                j++;  
                
                    
            }
        }
        return ans;
    }
};