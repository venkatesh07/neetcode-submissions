class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0, rightMax = n-1;
        int max = 0;
        int leftHighest = 0, rightHighest = 0;

        while(leftMax < rightMax){
            if(height[leftMax] < height[rightMax]){
                if(height[leftMax] > leftHighest){
                    leftHighest = height[leftMax];
                }else{
                    max += leftHighest - height[leftMax];
                }
                leftMax++;
            }else{
                 if(height[rightMax] > rightHighest){
                    rightHighest = height[rightMax];
                }else{
                    max += rightHighest - height[rightMax];
                }
                rightMax--;
            }
        }
        return max;
    }
}
