class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int>set1(nums1.begin(),nums1.end());
        unordered_set<int>set2(nums2.begin(),nums2.end());
        vector<int>temp1,temp2;
        for(auto s:set1){
            if(set2.count(s)==0){
                temp1.push_back(s);
            }
        }
        for(auto s:set2){
            if(set1.count(s)==0){
                temp2.push_back(s);
            }
        }
        
        return {temp1,temp2};
    }
};