class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> mp = new HashMap<>();
        int flag = 0;
        int len = 0;
        
        for (String word : words) {
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
        System.out.println(mp);
        for (String key : mp.keySet()) {
            char char1 = key.charAt(0);
            char char2 = key.charAt(1);
            
            String w = "" + char2 + char1;
            
            if (char1 != char2 && mp.containsKey(w)) {
                len += Math.min(mp.get(key), mp.get(w)) * 2;
                //mp.remove(w); // Remove the mirrored key
            } 
            if (char1 == char2) {
                if (mp.get(key) % 2 == 0) {
                    len += mp.get(key)*2;
                } else
                {
                    if(flag==0){
                        len += mp.get(key) *2;
                    flag = 1; // Marking flag
                    }
                    else{
                        len += (mp.get(key) - 1)*2;
                    }
                    
                }
            }
        }
        
        return len; // Add flag value if odd occurrences were found
    }
}
