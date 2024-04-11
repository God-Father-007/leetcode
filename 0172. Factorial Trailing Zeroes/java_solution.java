class Solution {
    public int sol(int n, int p) {
        if( n/p < 1 ) { return 0; }
        return n/p + sol(n,p*5);
    }
    public int trailingZeroes(int n) {
        return sol(n,5);
    }
}