class Solution {
    public int lastStoneWeight(int[] stones) {
        
        int n = stones.length;
        if(n == 0) return 0;
        int res = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            pq.add(stones[i]);
        }

        while(pq.size() >= 2){
            int num1 = pq.poll();
            int num2 = pq.poll();
            if((num1 - num2) > 0){
                pq.add(num1 - num2);
            }
        }
        if(!pq.isEmpty()){
            res = pq.poll();
        }
        return res;
    }
}
