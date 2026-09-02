class Solution {
    public int removeDuplicates(int[] nums) {

        //basecase
        int n = nums.length;
        int j = 1;

        for(int i=1;i<n;i++){
            if(nums[i] != nums[j-1]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}