class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //basecase
        int n = numbers.length;
        if(n == 0) return new int[]{-1, -1};
        int low = 0, high = n-1, sum = 0;
        int[] res = {-1, -1};

        while(low < high){
            sum = numbers[low] + numbers[high];
            if(sum == target){
                res[0] = low+1;
                res[1] = high+1;
                return res;
            }else if(sum > target){
                high--;
            }else{
                low++;
            }
        }
        return res;
    }
}
