class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();
        //basecase
        HashSet<Character> set = new HashSet<>();

        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        int max = 0;

        for(char c:set){
            int l = 0, count = 0;
            for(int r=0;r<n;r++){
                  if(s.charAt(r) == c){
                    count++;
                  }
                  while((r-l+1) - count > k){
                    if(s.charAt(l) == c){
                        count--;
                    }
                    l++;
                  }
            max = Math.max(max, r-l+1);
            }
        }
        return max;
    }
}
