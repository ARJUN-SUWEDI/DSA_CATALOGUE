class MinStack {

    private ArrayList<Integer> ls;
    private int size=0;
    public MinStack() {
        ls=new ArrayList<Integer>();
    }
    
    public void push(int val) {
        ls.add(size++,val);
    }
    
    public void pop() {
        ls.remove(--size);
    }
    
    public int top() {
        return ls.get(size-1);
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int num:ls){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */