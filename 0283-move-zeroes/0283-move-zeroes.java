class Solution {
    public void swap(int[] nums,int i,int j){
        int tempo=nums[i];
        nums[i]=nums[j];
        nums[j]=tempo;
    }
    public void moveZeroes(int[] nums) {
        int temp=0;
        if(nums.length==1)return;
        int nonzeroindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonzeroindex]=nums[i];
                nonzeroindex++;
            }
        }
        while(nonzeroindex<nums.length){
            nums[nonzeroindex]=0;
            nonzeroindex++;
        }
    }
}