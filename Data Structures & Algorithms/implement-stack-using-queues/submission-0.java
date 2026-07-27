class MyStack {

    Queue<Integer> q;
    Queue<Integer> temp;
    

    public MyStack() {
        q=new LinkedList<>();
        temp=new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q.isEmpty()){
            temp.offer(q.poll());
        }
        q.offer(x);
        while(!temp.isEmpty()){
            q.offer(temp.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
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