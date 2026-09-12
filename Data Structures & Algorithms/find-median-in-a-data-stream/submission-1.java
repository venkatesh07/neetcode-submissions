class MedianFinder {
    
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
    maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
    minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        if(maxHeap.size() - minHeap.size() > 1 || !minHeap.isEmpty()
        && maxHeap.peek() > minHeap.peek()){
            minHeap.add(maxHeap.poll());
        }
        if(minHeap.size() - maxHeap.size() > 1){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {

        if(minHeap.size() == maxHeap.size()){
            return (double) (minHeap.peek() + maxHeap.peek())/2;
        }else if(maxHeap.size() > minHeap.size()){
            return (double)maxHeap.peek();
        }else{
            return (double)minHeap.peek();
        }  
    }
}
