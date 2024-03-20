class Solution {
    public int firstUniqChar(String s) {
       // Character chr=null;
        Map<Character,Integer>mp=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
       // System.out.println(mp);
        for(int i=0;i<s.length();i++){
           if(mp.get(s.charAt(i))==1){
               return i;
           }
        }
       
        return -1;
    }
}