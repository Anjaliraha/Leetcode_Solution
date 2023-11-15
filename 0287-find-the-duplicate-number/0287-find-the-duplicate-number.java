class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        
        
        // 1 3 4 2 2
        // s     f
        
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}