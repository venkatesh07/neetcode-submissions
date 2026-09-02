class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        //basecase
        //8 7 6 5 4 3 2 1
        k = k%n;
        swap(nums, 0, n-1);
        swap(nums, 0, k-1);
        swap(nums, k, n-1);
        
    }
    private void swap(int[] nums, int low, int high){
        while(low < high){
            int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
        low++;
        high--;
        }
    }
}