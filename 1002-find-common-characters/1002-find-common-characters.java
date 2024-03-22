class Solution {
    public List<String> commonChars(String[] words) {
//         Map<String,Map<Character,Integer>>mp=new HashMap<>();
        
        
//         for(int i=0;i<words.length();i++){
//             Map<Character,Integer>inner=new HashMap<>();
//             for(char c:i.toCharArray()){
//                 inner.put(c,inner.getOrDefault(c,0)+1);
//             }
//             mp.put(word.CharAt(i),inner);
//         }
        List<String>commonelements=new ArrayList<>();
        int[] freqencies=new int[26];
    Arrays.fill(freqencies,Integer.MAX_VALUE);
        
        for(String c:words){
            int[] character_fre=new int[26];
            //String ch=c;
            Arrays.fill(character_fre,0);
            for(char ch:c.toCharArray()){
                character_fre[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                freqencies[i]=Math.min(freqencies[i],character_fre[i]);
            }
        }
       for(int i=0;i<26;i++){
           while(freqencies[i]>0){
               //commonelements.add(Character.toString(char)('a'+i));
               commonelements.add(Character.toString((char) ('a' + i)));
               freqencies[i]--;
           }
       }
        return commonelements;
    }
}