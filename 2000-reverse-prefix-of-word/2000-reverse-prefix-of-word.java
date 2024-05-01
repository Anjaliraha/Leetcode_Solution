class Solution {
    static String reversePrefix(String word, char ch){
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int start = 0, end = 0;
        while(end < n && word.charAt(end) != ch){
            end++;
        }
        if(end == n){
            sb.append(word);
            return String.valueOf(sb);
        }

        String s = word.substring(start, end + 1);
        sb.append(s);
        sb.reverse();
        String s1 = word.substring(end+1, n);
        sb.append(s1);

        return String.valueOf(sb);
    }
}