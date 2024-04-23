class Solution {
    public int[] swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    } 
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int l=nums.length-1;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]>nums[j]){
                ans[l--]=nums[i];
                i++;
            }
            else{
                ans[l--]=nums[j];
                j--;
            }
        }
        return ans;
    }
}