class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        stack<int>s;
        unordered_map<int,int>mp;
        vector<int>ans(nums.size(),0);
        int n=nums.size();
        for(int i=2*(n-1);i>=0;i--){
            int ele=nums[i%n];
            while(!s.empty() && s.top()<=ele){
                s.pop();
            }
            int res=s.empty()?-1:s.top();
           // mp.insert({ele,res});
            ans[i%n]=res;
            s.push(ele);
        }
        
        
        return ans;
    }
};