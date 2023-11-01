class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        for(int num:nums){
            right+=num;
        }
        //System.out.println(right);
        for(int i=0;i<nums.length;i++){
           left=left+nums[i];
            if(left==right){
                return i;
            }
           right=right-nums[i]; 
       }
        return -1;
    }
}