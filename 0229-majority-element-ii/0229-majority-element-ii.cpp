class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
       vector<int>ans;
        int candidate1=INT_MIN,candidate2=INT_MIN;
        int life1=0,life2=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==candidate1){
                life1++;
            }
            else if(nums[i]==candidate2){
                life2++;
            }
            else if(life1==0){
                candidate1=nums[i];
                life1=1;
            }
            else if(life2==0){
                candidate2=nums[i];
                life2=1;
            }
            else{
                life1--;
                life2--;
            }
        }
        int count1=0,count2=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==candidate1){
                count1++;
            }
            if(nums[i]==candidate2){
                count2++;
            }
        }
        if(count1>(nums.size()/3))ans.push_back(candidate1);
        if(count2>(nums.size()/3))ans.push_back(candidate2);
        return ans;
    }
};