class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i-1]==nums[i])continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j-1]==nums[j])continue;
                long sum=(long)target-nums[i]-nums[j];
                int l=j+1;
                int k=n-1;
                while(l<k){
                    if((long) nums[l]+nums[k]==sum){
                        List<Integer>ls=new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[k]);
                        ls.add(nums[l]);
                        ans.add(ls);
                        l++;
                        k--;
                        while(l<k && nums[l]==nums[l-1])l++;
                        while(l<k && nums[k]==nums[k+1])k--;
                    }
                    else if((long) nums[l]+nums[k]<sum){
                        l++;
                    }
                    else{
                        k--;
                    }
                }
            }
          
        }
        return ans;
    }
}