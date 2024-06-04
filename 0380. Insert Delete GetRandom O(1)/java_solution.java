class RandomizedSet {

    Set<Integer> s;

    public RandomizedSet() {
        this.s = new HashSet<>();
    }
    
    public boolean insert(int val) {
        boolean ret = s.contains( val );
        s.add( val );
        return !ret;
    }
    
    public boolean remove(int val) {
        boolean ret = s.contains( val );
        s.remove( val );
        return ret;
    }
    
    public int getRandom() {
        int i = (int)Math.floor( Math.random() * s.size() );
        int ans = 0;
        for( int v : s ) {
            i--;
            if( i < 0 ) { ans = v; break; }
        }
        return ans;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */