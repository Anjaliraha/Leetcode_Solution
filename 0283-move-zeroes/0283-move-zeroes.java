class Solution {
    public void swap(int[] nums,int i,int j){
        int tempo=nums[i];
        nums[i]=nums[j];
        nums[j]=tempo;
    }
    public void moveZeroes(int[] nums) {
        int temp=0;
        if(nums.length>1){
            for(int i=1;i<nums.length;i++){
            if(nums[i]==0 && nums[i-1]!=0){
                temp=i;
            }
            else if(nums[i]!=0 && nums[temp]==0){
                swap(nums,temp,i);
                temp++;
            }
        }
        }
        
    }
}