class Solution {
    public int firstUniqChar(String s) {
        Character chr=null;
        Map<Character,Integer>mp=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
       // System.out.println(mp);
        for(Character ch:mp.keySet()){
            if(mp.get(ch)==1){
                chr=ch;
                break;
            }
        }
        if(chr==null)return -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==chr && chr!=null){
                return i;
               // break;
            }
        }
        return -1;
    }
}