class MinStack {
    private Stack <Integer> st;
    private Stack <Integer> min;
    public MinStack() {
        st = new Stack();
        min = new Stack();
    }
    
    public void push(int value) {
        if(st.size() == 0 || min.peek() >= value){
            min.push(value);
        }
        st.push(value);
    }
    
    public void pop() {
        int lel = st.pop();
        int ele = min.peek();
        if(lel == ele){
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */