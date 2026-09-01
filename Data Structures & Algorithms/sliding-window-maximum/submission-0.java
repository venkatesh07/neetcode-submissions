class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        //basecase
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();

        int l = 0, r = 0;

        while(r < n){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[r]){
                dq.pollLast();
            }
            dq.addLast(r);
            if(l > dq.peekFirst()){
                 dq.pollFirst();
            }
            if(r+1 >= k){
                res[l] = nums[dq.peekFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}
