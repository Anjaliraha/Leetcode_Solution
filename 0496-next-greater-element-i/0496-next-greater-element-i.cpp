class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int>mp;
        stack<int>s;
        int n=nums2.size();
        vector<int>ans;
        for(int i=n-1;i>=0;i--){
            int ele=nums2[i];
            while(!s.empty() && s.top()<=ele){
                s.pop();
            }
            int res=s.empty()?-1:s.top();
            mp.insert({ele,res});
            s.push(ele);
        }
        for(auto x:nums1){
            ans.push_back(mp[x]);
        }
        return ans;
    }
};