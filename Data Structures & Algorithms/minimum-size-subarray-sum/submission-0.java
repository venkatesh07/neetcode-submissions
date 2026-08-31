class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        //basecase

        int sum = 0, l = 0, minLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum += nums[i];
            while(sum >= target){
                sum -= nums[l];
                minLen = Math.min(minLen, i-l+1);
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}