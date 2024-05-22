class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n= nums.length;
        int i=0,j=0;
        long ans=0;
        Map<Integer,Integer>mp=new HashMap<>();
        long sum=0;
        //int count=0;
        if(n<k)return 0;
        while(j<n){
            sum+=nums[j];
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            
               if(j-i+1>k){
                   System.out.println("hello");
                     sum=sum-nums[i];
                     mp.put(nums[i],mp.get(nums[i])-1); 
                    if(mp.get(nums[i])==0){
                        mp.remove(nums[i]);
                    }
                   i++;
                } 
               
            if(j-i+1==k && mp.size()==k){
                //System.out.println("hello kk");
                ans=Math.max(ans,sum);
            }
            j++;
        }
        return ans;
    }
}