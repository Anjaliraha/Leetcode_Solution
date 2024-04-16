class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countNumberOfSubarrays(nums,k)-countNumberOfSubarrays(nums,k-1);
        
        
    }
    public int countNumberOfSubarrays(int[] nums,int k){
        int n=nums.length;
        int count=0;
        int sum_odd=0;
        int l=0,r=0;
        while(r<n){
            if(nums[r]%2!=0){
                sum_odd++;
            }
            while(sum_odd>k){
                if(nums[l]%2!=0){
                sum_odd--;
            }
                l++;
            }
            count=count+r-l+1;
            r++;
        }
        return count;
    }
}