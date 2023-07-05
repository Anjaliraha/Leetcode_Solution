class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int life=0,candidate=INT_MIN;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==candidate){
                life++;
            }
            else if(life==0){
                candidate=nums[i];
                life=1;
            }
            else{
                life--;
            }
        }
        return candidate;
    }
};