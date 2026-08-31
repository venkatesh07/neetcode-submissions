class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        //basecase 
        int sizeOfSmall = s1.length();

        int[] count1 = new int[26];
        for(char c:s1.toCharArray()) count1[c - 'a']++;

        int[] count2 = new int[26];
        int l = 0;
        
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            count2[c - 'a']++;
            if(i-l+1 == sizeOfSmall){
                  if(Arrays.equals(count1, count2)){
                    return true;
                  }
               count2[s2.charAt(l) - 'a']--;
               l++;
            }
        }
        return false;
    }
}
