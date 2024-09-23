class MyHashSet {
    ArrayList<Integer> a;

    /** Initialize your data structure here. */
    public MyHashSet() {
        a = new ArrayList<>();
    }
    
    public void add(int key) {
        // if( a.size() == 0 ) { a.add(key); return; }
        // int r = Collections.binarySearch( a, key );
        // if( r < 0 ) {
        //     r += a.size();
        //     if( r < 0 ) { a.add(key); }
        //     else { a.add( r, key ); }
        // }
        if( contains(key) == false ) {
            a.add(key);
            Collections.sort(a);
        }
    }
    
    public void remove(int key) {
        int r = Collections.binarySearch( a, key );
        if( r >= 0 ) { a.remove(r); }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int r = Collections.binarySearch(a, key);
        return r < 0 ? false : true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */