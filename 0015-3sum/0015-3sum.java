class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     //   List <Set<Integer>> ls = new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
      //  Map<Integer,Integer>mp=new HashMap<>();
       // int i=0;
        int n=nums.length;
        Arrays.sort(nums);
      //  System.out.println(Arrays.toString(nums));
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            int target=-nums[i];
            if(i>0 && nums[i]==nums[i-1])continue;
            while(j<k){
                if(nums[j]+nums[k]==target){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                   // ls.add(set);
                        j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;
                
                }
                else if((nums[j]+nums[k])<target){
                    j++;
                }
                else{
                    k--;
                }
            }
         //   mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       // System.out.println(mp);
      
        return ans;
    }

}