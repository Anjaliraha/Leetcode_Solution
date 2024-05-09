class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        int j=n-1;
        int count=0;
        while(i<j){
            if((long)nums[i]+nums[j]==k){
                count++;
                i++;
                j--;
            }
            else if((long)nums[i]+nums[j]<k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}