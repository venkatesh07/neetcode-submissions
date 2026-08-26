class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(asteroids[i]);
            }else if(st.peek() > 0 && asteroids[i] < 0){
                while(!st.isEmpty() && Math.abs(asteroids[i]) > st.peek() && st.peek() > 0){
                      st.pop();
                }
                if(st.isEmpty()){
                      st.push(asteroids[i]);
                }
                else if(st.peek() == Math.abs(asteroids[i])){
                      st.pop();
                }
                else if (st.peek() < 0) {
                 st.push(asteroids[i]);
                }
            }
            else{
                    st.push(asteroids[i]);
        }
        }
        int len = st.size();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
               arr[i] = st.get(i);
        }
        return arr;
    }
}