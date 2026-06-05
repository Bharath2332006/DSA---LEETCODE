class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minst;
    public MinStack() {
        stack=new Stack<>();
        minst=new Stack<>();
    }
    public void push(int value) {
        if(minst.isEmpty() || value<=minst.peek()) minst.push(value);
        else minst.push(minst.peek());
        stack.push(value);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        stack.pop();
        minst.pop();
    }
    
    public int top() {
        if(stack.isEmpty()) return-1 ;
        return stack.peek();
    }
    
    public int getMin() {
        if(minst.isEmpty()) return -1;
        return minst.peek();
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