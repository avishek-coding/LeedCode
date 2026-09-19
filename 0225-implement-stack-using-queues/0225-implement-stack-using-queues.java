class MyStack {
     private Queue<Integer> queue;
     private Queue<Integer> temp;
    public MyStack() {
        queue = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x) {
        temp.add(x);

        while(!queue.isEmpty() ){
            temp.add(queue.remove());
        }
        Queue<Integer> q= queue;
        queue = temp;
        temp = q;
        
    }
    
    public int pop() {
        return queue.remove();

    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
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