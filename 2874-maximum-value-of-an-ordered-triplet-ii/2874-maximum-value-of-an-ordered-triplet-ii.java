class Solution {
    public long maximumTripletValue(int[] nums) {
        long[] prefix=new long[nums.length];
        prefix[1]=nums[0]-nums[1];
        long d=Math.max(nums[0],nums[1]);
        long product=0;
        for(int i=2;i<nums.length;i++){
            
            long g=prefix[i-1];
            prefix[i]=Math.max(g,d-nums[i]);
            //prefix[i]=g;
            product= Math.max(product,prefix[i-1]*nums[i]);
            d=Math.max(d,nums[i]);
        }
        if(product<0)return 0;
       return product; 
    }
}