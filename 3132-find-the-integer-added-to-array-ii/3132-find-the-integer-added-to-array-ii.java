class Solution {
    public Boolean check(int[] nums1,int[] nums2,int x){
        int count=0;
        int j=0;
        for(int i=0;i<nums1.length && j<nums2.length;i++){
            if(nums1[i]+x!=nums2[j]){
                count++;
            }
            else{
                j++;
            }
            if(count>2)return false;
        }
        return true;
    }
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        int minm=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            int x=nums2[0]-nums1[i];
            if(check(nums1,nums2,x)){
                minm=Math.min(minm,x);
            }
        }
        return minm;
    }
}