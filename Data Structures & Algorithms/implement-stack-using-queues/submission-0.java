class MyStack {
        Queue<Integer> q;


    public MyStack() {
                q = new LinkedList<>();

    }
    
    public void push(int x) {
        int n = q.size();
        q.add(x);
        while(n > 0){
            int ans = q.poll();
            q.add(ans);
            n--;
        }
    }
    
    public int pop() {
        int ans = -1;
        if(q.isEmpty()){
            return ans;
        }
        ans = q.poll();
        return ans;
    }
    
    public int top() {
         int ans = -1;
        if(q.isEmpty()){
            return ans;
        }
        ans = q.peek();
        return ans;
    }
    
    public boolean empty() {
        return q.isEmpty();

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */