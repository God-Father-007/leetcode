class Solution {
    List<Integer> allow;
    Set<Integer> restrict;
    boolean restricted;
    int n;
    public Solution(int n, int[] blacklist) {
        this.n = n;
        this.restricted = blacklist.length < n/2;
        this.restrict = new HashSet<>();
        for( int num : blacklist ) { restrict.add(num); }
        if( !restricted ) {
            this.allow = new ArrayList<>();
            for( int i = 0; i < n; i++ ) {
                if( !this.restrict.contains( i ) ) {
                    this.allow.add(i);
                }
                this.restrict.remove(i);
            } 
        }
    }
    
    public int pick() {
        if( !restricted ) {
            int idx = (int)(this.allow.size()*Math.random());
            return allow.get( idx );
        }
        int val = 0;
        do{
            val = (int)(n*Math.random());
        } while( restrict.contains(val) );
        return val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */