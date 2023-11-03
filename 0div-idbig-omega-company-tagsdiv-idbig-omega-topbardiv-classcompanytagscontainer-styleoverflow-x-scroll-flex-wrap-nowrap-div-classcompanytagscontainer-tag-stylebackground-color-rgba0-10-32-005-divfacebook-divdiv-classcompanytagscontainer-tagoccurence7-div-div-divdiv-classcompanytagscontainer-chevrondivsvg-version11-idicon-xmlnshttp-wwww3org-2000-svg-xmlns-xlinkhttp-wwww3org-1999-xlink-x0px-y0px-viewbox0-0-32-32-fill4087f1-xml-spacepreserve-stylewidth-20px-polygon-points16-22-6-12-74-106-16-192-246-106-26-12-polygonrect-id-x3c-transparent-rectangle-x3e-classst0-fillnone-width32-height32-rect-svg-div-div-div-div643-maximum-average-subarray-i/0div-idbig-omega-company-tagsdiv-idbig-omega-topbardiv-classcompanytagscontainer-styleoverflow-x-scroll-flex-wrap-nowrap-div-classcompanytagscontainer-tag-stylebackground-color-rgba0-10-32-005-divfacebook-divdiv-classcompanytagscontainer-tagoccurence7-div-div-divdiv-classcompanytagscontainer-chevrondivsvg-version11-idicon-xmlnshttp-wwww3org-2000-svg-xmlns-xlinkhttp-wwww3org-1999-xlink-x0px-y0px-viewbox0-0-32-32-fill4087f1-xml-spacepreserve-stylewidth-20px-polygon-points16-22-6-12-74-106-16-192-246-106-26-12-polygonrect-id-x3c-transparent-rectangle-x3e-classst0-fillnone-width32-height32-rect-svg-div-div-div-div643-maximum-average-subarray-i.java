class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double maxi=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        double sum=0;
        int n= nums.length;
        while(j<n){
            if((j-i+1)<k){
                sum+=nums[j];
                j++;
            }
            if(j-i+1==k ){
                sum=sum+nums[j];
                maxi=Math.max(maxi,sum/k);
                sum=sum-nums[i];
                i++;
                //if(j<n-1)
                j++;
                
            }
        }
        return maxi;
    }
}