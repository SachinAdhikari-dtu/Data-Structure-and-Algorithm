class MinStack {

    Stack<Integer> s;
    Stack<Integer> s2;

    public MinStack() {
        s=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(s2.isEmpty()){
            s2.push(val);
        }else{
            val=Math.min(val,s2.peek());
            s2.push(val);
        }
    }
    
    public void pop() {
       s.pop();
       s2.pop();
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return s2.peek();
    }
}
