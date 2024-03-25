class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean>present=new HashMap<>();
        Map<Integer,Boolean>checked=new HashMap<>();
        for(int num:nums){
            present.put(num,true);
        }
        int longestconsecutiveseq=0;
        for(int num : nums){
            if(!checked.containsKey(num) && !present.containsKey(num-1)){
                int start=num;
                int currentLength=0;
                while(present.containsKey(start)){
                    currentLength++;
                     checked.put(start,true);
                    start++;
                   
                }
              longestconsecutiveseq=Math.max(longestconsecutiveseq,currentLength);  
            }
        }
        return longestconsecutiveseq;
    }
}