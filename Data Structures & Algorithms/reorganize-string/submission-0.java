class Solution {
    public String reorganizeString(String s) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));

        String res = "";
        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(count[i] > 0){
                pq.add(new int[]{(char)('a' + i), count[i]});
            }
        }

        StringBuilder sb = new StringBuilder();
        int[] prev = new int[]{'#', 0};

        while(!pq.isEmpty()){
            int[] current = pq.poll();
            sb.append((char)current[0]);
            if(prev[1] > 0){
                pq.add(prev);
            }
            current[1]--;
            prev = current;
        }
        if(sb.length() != s.length()) return "";
        return sb.toString();
    }
}