class MinStack {
    int[] s;
    int i=-1, min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    
    public MinStack() {
        s = new int[1];
    }
    
    public void push(int x) {
        if( i == s.length-1 ) { s = Arrays.copyOf(s,2*s.length); }
        i++;
        s[i] = x;
        min = Math.min(min,x);
    }
    
    public void pop() {
        if(min == s[i] ) {
            min = Integer.MAX_VALUE;
            for(int j=0;j<i;j++) { min = Math.min( min,s[j] ); }
        }
        i--;
    }
    
    public int top() {
        return s[i];
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */