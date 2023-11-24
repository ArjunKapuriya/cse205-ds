class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min=new Stack<>();
    
 

    public MinStack() {
         
    }
    
    public void push(int val) {
        if(min.isEmpty() || min.peek()<val){
            min.push(val);
        }
        stack.push(val);
        
        
    }
    
    public void pop() {
        
        if(min.peek()==stack.pop()){
            min.pop();
        }
       stack.pop();
        
    }
    
    public int top() {
        return stack.peek();
       
        
    }
    
    public int getMin() {
        return min.peek();
       
        
    }
}

