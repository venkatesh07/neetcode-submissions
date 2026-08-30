class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int n = strs.length;
        
        //basecase

        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            String st = strs[i];
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(st);
        }
        return new ArrayList<>(map.values());
    }
}
