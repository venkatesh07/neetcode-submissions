class Solution {
    public String longestCommonPrefix(String[] strs) {

        String current = "";
        
        for(int i=0;i<strs[0].length();i++){
            boolean flag = true;
            char ch = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i < strs[j].length()){
                if(ch != strs[j].charAt(i)){
                    flag = false;
                }}else{
                    flag = false;
                }
            }
            if(flag == false) break;
            if(flag == true) current = current + strs[0].charAt(i);
        }
        return current;
    }
}