class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
       int n = word.length();
        Map<String,Integer>mp=new HashMap<>();
        for(int i=0;i+k<=n;i=i+k){
           // if(word.substring(i,i+k) != word.substring(i+1,i+1+k))
            mp.put(word.substring(i,i+k),mp.getOrDefault(word.substring(i,i+k),0)+1);
          
        }
       // System.out.println(mp);
        int len=0;
        for(String key:mp.keySet()){
            len=Math.max(mp.get(key),len);
        }
        return n/k - len;
    }
}