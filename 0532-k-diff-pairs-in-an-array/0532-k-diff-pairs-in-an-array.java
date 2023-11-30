class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        Set<Integer>numset=new HashSet<>();
        Set<Integer>pairset=new HashSet<>();
      
        for(int num:nums){
         if (k == 0 && !numset.add(num)) {
                // If k=0, count the unique occurrences of the same number
                if (pairset.add(num)) {
                    count++;
                }
            }
            else if(k>0){
                if(numset.contains(num-k)){
                    if(pairset.add(num-k)){
                        count++;
                    }
                }
            }
             numset.add(num);
        }
        
       
        return count;
    }
}