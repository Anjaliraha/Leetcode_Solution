class Solution {
    public void swap(int nums[],int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public int findDuplicate(int[] nums) {
//         int slow=0;
//         int fast=0;
        
        
//         // 1 3 4 2 2
//         // s     f
        
//         do{
//             slow=nums[slow];
//             fast=nums[nums[fast]];
//         }while(slow!=fast);
//         slow=0;
//         while(slow!=fast){
//             slow=nums[slow];
//             fast=nums[fast];
//         }
//         return fast;
        
        while(nums[0]!=nums[nums[0]]){
            swap(nums,0,nums[0]);
        }
        return nums[0];
    }
}