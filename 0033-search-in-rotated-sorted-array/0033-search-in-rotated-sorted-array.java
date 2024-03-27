class Solution {
    public int pivotElement(int[] nums){
        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            if(low==high)return mid;
            if(mid>0 && nums[mid-1]>nums[mid])return mid-1;
            else if(nums[mid]>nums[mid+1])return mid;
            else if(nums[mid]>=nums[low])low=mid+1;
            else high=mid;
            mid=low+(high-low)/2;
        }
        return high;
    }
    public int bs(int[] nums,int low,int high, int target){
        int mid=low+(high-low)/2;
        while(low<=high){
            if(nums[mid]==target)return mid;
            else if (nums[mid]<target)low=mid+1;
            else high=mid-1;
            mid=low+(high-low)/2;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot=pivotElement(nums);
       
        if(nums[pivot]>target && nums[0]>target){
            return bs(nums,pivot+1,nums.length-1,target);
        }
        return  bs(nums,0,pivot,target);
    }
}