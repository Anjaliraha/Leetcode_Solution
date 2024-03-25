class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int diff1=nums[i]-k;
            int diff2=nums[i]+k;
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.containsKey(diff1)){
                count+=mp.get(diff1);
            }
             if(mp.containsKey(diff2)){
                count+=mp.get(diff2);
            }
          
                
            
        }
    
        return count;
    }
}