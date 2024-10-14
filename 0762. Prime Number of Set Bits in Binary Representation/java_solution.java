class Solution {
    
    private int countSetBits( int n ) {
        int sb = 0;
        while( n > 0 ) {
            int mask = n&((~n)+1);
            if( mask > 0 ) { sb++; }
            n &= ~mask;
        }
        return sb;
    }
    
    private boolean prime( int n ) {
        if( n == 1 ) { return false; }
        for( int i=2;i*i<=n;i++ ) {
            if( n%i == 0 ) { return false; }
        }
        return true;
    }
    
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for( int i=left;i<=right;i++ ) {
            int sb = countSetBits(i);
            if( prime(sb) ) { ans++; }
        }
        return ans;
    }
}