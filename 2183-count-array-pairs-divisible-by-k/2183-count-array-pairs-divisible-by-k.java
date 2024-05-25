class Solution {
    public long findgcd(int nums,int k){
        while(nums!=0 && k!=0){
            if(nums>k){
                nums=nums%k;
            }
            else {
                k=k%nums;
            }
        }
        if(nums==0)return k;
        return nums;
    }
    public long countPairs(int[] nums, int k) {
        Map<Long,Integer>mp=new HashMap<>();
        long count=0;
        for(int i=0;i<nums.length;i++){
           long gcdfirst=findgcd(nums[i],k);
          //  System.out.println(gcdfirst);
            for(long gcdsecond:mp.keySet()){
                if((gcdsecond*gcdfirst)%k==0){
                    count+=mp.get(gcdsecond);
                }
            }
            mp.put(gcdfirst,mp.getOrDefault(gcdfirst,0)+1);
        }
       // System.out.println(mp);
        return count;
    }
}