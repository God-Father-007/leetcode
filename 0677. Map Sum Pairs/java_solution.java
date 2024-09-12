class MapSum {
    Map<String,Integer> m;
    public MapSum() {
        m = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        m.put( key,val );
    }
    
    public int sum(String prefix) {
        int ans = 0;
        for( String key : m.keySet() ) {
            if( key.startsWith(prefix) ) {
                ans += m.get(key);
            }
        }
        return ans;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */