class Solution {
    public int findKthLargest(int[] nums, int k) {

        if(k > nums.length) return 0;
        int res = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        while(k > 0){
            res = pq.poll();
            k--;
        }
        return res;
    }
}
