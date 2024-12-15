class RecentCounter {
    ArrayList<Integer> time;
    
    public RecentCounter() {
        this.time = new ArrayList<>();
    }
    
    public int ping(int t) {
        time.add(t);
        if( time.size() == 1 ) { return 1; }
        if( t < 3001 ) { return time.size(); }
        int i = Collections.binarySearch(time, t-3000);
        if( i < 0 ) { i = Math.abs(i+1); }
        return time.size() - i;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */