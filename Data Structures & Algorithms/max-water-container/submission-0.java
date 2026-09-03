class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;
        //basecase
        int low = 0, high = n-1;
        int maxArea = 0;

        while(low < high){
            int width = high-low;
            int height = Math.min(heights[low], heights[high]);
            maxArea = Math.max(maxArea, height*width);

            if(heights[low] > heights[high]){
                high--;
            }else{
                low++;
            }
        }
        return maxArea;
    }
}
