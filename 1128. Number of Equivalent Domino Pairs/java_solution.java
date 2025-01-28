class Solution {
    
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> h = new HashMap<>();
        for( int[] d : dominoes ) {
            String a = d[0] + "-" + d[1], b = d[1] + "-" + d[0];
            if( h.containsKey(a) || h.containsKey(b) ) {
                if(h.containsKey(a)) { h.put( a, h.get(a)+1 ); }
                else { h.put( b, h.get(b)+1 ); }
            } else { h.put( a,1 ); }
        }
        int ans = 0;
        for( int n : h.values() ) {
            if(n < 2) { continue; }
            ans += (n*(n-1))/2;   // ncr(n,2)
        }
        return ans;
    }
}