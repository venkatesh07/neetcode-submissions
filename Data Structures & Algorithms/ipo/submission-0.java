class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

      
      PriorityQueue<Integer> minCapital = new PriorityQueue<>((a, b) -> (capital[a] - capital[b]));
        
      PriorityQueue<Integer> maxProfits = new PriorityQueue<>((a, b) -> (profits[b] - profits[a]));

      for(int i=0;i<capital.length;i++){
         minCapital.offer(i); //0 1 2 3
      }

      for(int i=0;i<k;i++){
        while(!minCapital.isEmpty() && capital[minCapital.peek()] <= w){
               maxProfits.offer(minCapital.poll());
        }
        if(maxProfits.isEmpty()) break;
        w += profits[maxProfits.poll()];
      }
      return w;
    }
}