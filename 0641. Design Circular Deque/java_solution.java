class MyCircularDeque {

    int[] dq;
    int f, r, size;
    public MyCircularDeque(int k) {
        this.dq = new int[k];
        this.f = 0; this.r = -1; this.size = 0;
    }
    
    public boolean insertFront(int value) {
        if( isFull() ) { return false; }
        this.f = this.f == 0 ? this.dq.length - 1 : this.f - 1 ;
        this.dq[this.f] = value;
        if( r < 0 ) { r = f; }
        this.size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if( isFull() ) { return false; }
        this.r = (this.r + 1) % this.dq.length ;
        this.dq[this.r] = value;
        this.size++;
        return true;
    }
    
    public boolean deleteFront() {
        if( isEmpty() ) { return false; }
        this.f = (this.f + 1) % this.dq.length;
        this.size--;
        return true;
    }
    
    public boolean deleteLast() {
        if( isEmpty() ) { return false; }
        this.r = this.r == 0 ? this.dq.length - 1 : this.r - 1 ;
        this.size--;
        return true;
    }
    
    public int getFront() {
        return isEmpty() ? -1 : this.dq[this.f] ;
    }
    
    public int getRear() {
        return isEmpty() ? -1 : this.dq[this.r] ;
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    public boolean isFull() {
        return this.size == this.dq.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */