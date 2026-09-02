class Solution {
    public void reverseString(char[] s) {

        int n = s.length;
        //basecase
        int low = 0, high = n-1;

        while(low < high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
        
    }
}