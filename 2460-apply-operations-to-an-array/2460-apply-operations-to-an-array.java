class Solution {
    public int[] applyOperations(int[] nums) {
        int[] nums_copy=nums.clone();
        for(int i=0;i<nums.length-1;i++){
            if(nums_copy[i]==nums_copy[i+1]){
                nums_copy[i]=nums_copy[i]*2;
                nums_copy[i+1]=0;
               // System.out.print(i + " ");
                // System.out.println(Arrays.toString(nums_copy));
            }
        }
      
        int temp=0;
        for(int i=1;i<nums.length;i++){
            if(nums_copy[i]!=0 && nums_copy[temp]==0){
                nums_copy[temp]=nums_copy[i];
                nums_copy[i]=0;
                temp++;
            }
            else if(nums_copy[temp]!=0){
                temp=i;
            }
        }
        return nums_copy;
    }
}