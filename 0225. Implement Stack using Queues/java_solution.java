class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
        /** Initialize your data structure here. */
        public MyStack() {
            q1 = new ArrayDeque<>();
            q2 = new ArrayDeque<>();
            top = -1;
        }
        
        /** Push element x onto stack. */
        public void push(int x) {
            if( q2.size() == 0 ) { q1.add(x); }
            else { q2.add(x); }
            top = x;
        }
        
        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            if( q1.size() == 0 && q2.size() == 0 ) { return -1; }
            if( q1.size() == 1 ) { top = -1; return q1.remove(); }
            else if( q2.size() == 1 ) { top = -1; return q2.remove(); }
            if( q1.size() > 0 ) {
                while( q1.size() > 2 ) {
                    q2.add( q1.remove() );
                }
                top = q1.remove();
                q2.add( top );
                return q1.remove();
            }
            else {
                while( q2.size() > 2 ) {
                    q1.add( q2.remove() );
                }
                top = q2.remove();
                q1.add( top );
                return q2.remove();
            }
        }
        
        /** Get the top element. */
        public int top() {
            return top;
        }
        
        /** Returns whether the stack is empty. */
        public boolean empty() {
            if( q1.size() == 0 && q2.size() == 0 ) { return true; }
            return false;
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