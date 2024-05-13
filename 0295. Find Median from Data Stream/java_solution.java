class MedianFinder {

    PriorityQueue<Integer> l, r;
    public MedianFinder() {
        this.l = new PriorityQueue<>(Collections.reverseOrder());
        this.r = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if( l.size() == 0 || num <= l.peek() ) {
            l.add( num );
            if( l.size() - r.size() > 1 ) { r.add( l.remove() ); }
        } else {
            r.add( num );
            if( r.size() - l.size() > 1 ) { l.add( r.remove() ); }
        }
    }
    
    public double findMedian() {
        if( l.size() == r.size() ) { return 1.0*( l.peek() + r.peek() ) / 2; }
        return l.size() > r.size() ? l.peek() : r.peek() ;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */