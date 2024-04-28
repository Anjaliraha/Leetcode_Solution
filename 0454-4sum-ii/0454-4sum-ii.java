class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                mp.put(nums1[i]+nums2[j],mp.getOrDefault(nums1[i]+nums2[j],0)+1);
               
            }
        }
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                if(mp.containsKey(-(nums3[i]+nums4[j]))){
                    count+=mp.get(-(nums3[i]+nums4[j]));
                }
               
            }
        }
        return count;
    }
}