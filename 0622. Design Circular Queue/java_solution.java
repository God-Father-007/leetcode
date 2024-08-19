class MyCircularQueue {

    int[] q;
    int f, r, size;

    public MyCircularQueue(int k) {
        this.q = new int[k];
        this.f = 0;
        this.r = -1;
        this.size = 0;
    }
    
    public boolean enQueue(int value) {
        if( isFull() ) { return false; }
        this.r = (this.r + 1) % this.q.length;
        this.size++;
        this.q[this.r] = value;
        return true;
    }
    
    public boolean deQueue() {
        if( isEmpty() ) { return false; }
        this.f = (this.f + 1) % this.q.length;
        this.size--;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : this.q[this.f];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : this.q[this.r] ;
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    public boolean isFull() {
        return this.size == this.q.length ;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */