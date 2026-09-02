class Solution {
    public String mergeAlternately(String word1, String word2) {

        //base case
        int m = word1.length(), n = word2.length();

        int word1len = 0, word2len = 0;
        StringBuilder sb = new StringBuilder();

        while(word1len < m && word2len < n){
                if(word1len < m){
                    sb.append(word1.charAt(word1len));
                    word1len++;
                }
                if(word2len < n){
                    sb.append(word2.charAt(word2len));
                    word2len++;
                }
        }
        while(word1len < m){
            sb.append(word1.charAt(word1len));
            word1len++;
        }
         while(word2len < n){
            sb.append(word2.charAt(word2len));
            word2len++;
        }
        return sb.toString();
    }
}