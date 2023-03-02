class NumArray {
    vector<int>nums;
    vector<int>sum;
public:
    NumArray(vector<int>& nums) {
        this->nums=nums;
        sum.resize(nums.size(),0);
        sum[0]=nums[0];
        for(int i=1;i<nums.size();i++){
            sum[i]=sum[i-1]+nums[i];
        }
    }
    
    int sumRange(int left, int right) {
        //int sum=0;
        
        return (left>0)?(sum[right]-sum[left-1]):(sum[right]);  
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */