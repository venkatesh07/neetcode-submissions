class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //basecase
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        int sum = 0;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while(low < high){
                sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                }else if(sum > 0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return res;
    }
}
