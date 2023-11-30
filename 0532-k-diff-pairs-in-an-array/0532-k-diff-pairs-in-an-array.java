class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        Map<Integer,Integer>pair=new HashMap<>();
        for(int num:nums){
            pair.put(num,pair.getOrDefault(num,0)+1);
        }
        for(int num:pair.keySet()){
            if(k==0){
                if(pair.get(num)>=2){
                    count++;
                } 
            }
            else{
                int target=k+num;
                if(pair.containsKey(target)){
                    count++;
                }
            }
        }
        
       
        return count;
    }
}