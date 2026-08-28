class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int max = 0, area = 0;
        int nse = 0, pse = 0;

        //arr[i] * nse - pse - 1

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                nse = i;
                int ind = st.peek();
                st.pop();
                pse = st.isEmpty() ? -1 : st.peek();
                int total = nse - pse - 1;
                area = total*heights[ind];
                max = Math.max(area, max);
            }
        st.push(i);
        }
        while(!st.isEmpty()){
            nse = n;
            int ind = st.peek();
            st.pop();
            pse = st.isEmpty() ? -1 : st.peek();
            area = heights[ind] * (nse - pse - 1);
            max = Math.max(area, max);
        }
        return max;
    }
}
