class Solution {
    public int findMaxK(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]>maxi && mp.containsKey(-nums[i])){
                maxi=Math.max(maxi,nums[i]);
            }
        }
        if(maxi==Integer.MIN_VALUE){
            return -1;
        }
        else return maxi;
    }
}