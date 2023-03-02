class NumArray {
    vector<int>nums;
    int sum;
public:
    NumArray(vector<int>& nums) {
        this->nums=nums;
        sum=0;
        //sum.resize(nums.size(),0);
        //sum[0]=nums[0];
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
        }
       // cout<<sum;
    }
    
    void update(int index, int val) {
       sum-=nums[index];
        nums[index]=val;
        sum+=val;
    }
    
    int sumRange(int left, int right) {
        int res=sum;
        for(int i=0;i<left;i++){
            res-=nums[i];
        }
         for(int i=right+1;i<nums.size();i++){
            res-=nums[i];
        }
        
      return res; 
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * obj->update(index,val);
 * int param_2 = obj->sumRange(left,right);
 */