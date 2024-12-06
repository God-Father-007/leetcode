class Solution {
    
    private int getHCF(int a, int b) {
        if( b > a ) {
            a += b;
            b = a-b;
            a = a-b;
        }
        while( a%b != 0 ) {
            int div = a;
            a = b;
            b = div%b;
        }
        return b;
    }
    
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for( int n : deck ) {
            if( !h.containsKey(n) ) { h.put(n,1); }
            else { h.put( n, h.get(n)+1 ); }
        }
        boolean first = true;
        int hcf = 0;
        for( int v : h.values() ) {
            if( first ) { hcf = v; first = false; }
            else { hcf = getHCF(v,hcf); }
            if( hcf < 2 ) { return false; }
        }
        return true;
    }
}