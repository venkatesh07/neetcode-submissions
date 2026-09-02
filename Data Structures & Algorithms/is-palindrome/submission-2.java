class Solution {
    public boolean isPalindrome(String s) {

        String str = s.replace(" ", "").toLowerCase(); 

        int n = str.length();
        int low = 0, high = n-1;

        while(low < high){
            while(low <= high && !Character.isLetterOrDigit(str.charAt(high))){
                   high--;
            }
            while(low <= high && !Character.isLetterOrDigit(str.charAt(low))){
                low++;
            }
            if(low > high) break;
            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
