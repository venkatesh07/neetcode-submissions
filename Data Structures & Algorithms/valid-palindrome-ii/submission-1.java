class Solution {
    public boolean validPalindrome(String s) {

        String str = s.replace(" ", "").toLowerCase(); 
        //basecase

        int n = str.length();
        int low = 0, high = n-1, k = 1;

        while(low < high){
            while(low <= high && !Character.isLetterOrDigit(str.charAt(high))){
                   high--;
            }
            while(low <= high && !Character.isLetterOrDigit(str.charAt(low))){
                low++;
            }
            if(low > high) break;
            if(str.charAt(low) != str.charAt(high)){
            if(isPalindrome(str, low+1, high) || isPalindrome(str, low, high-1)){
                return true;
                }else{
                    return false;
                }
            }
            low++;
            high--;
        }
        return true;
        
    }
    private boolean isPalindrome(String str, int low, int high){
        while(low < high){
            if(str.charAt(low) != str.charAt(high)){
            return false;
        }
        low++;
        high--;
        }
        return true;
    }
}