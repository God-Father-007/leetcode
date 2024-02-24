class Solution {
    
    static Integer ans;
    
    private void helper(int i, int n, int queensRemaining, int c, int d1, int d2) {
        if( queensRemaining == 0 ) {
            ans++;
            return;
        }
        for( int j=0;j<n;j++ ) {
            if( (c & (1<<j)) > 0 || (d1 & (1<<(i+j))) > 0 || (d2 & (1<<(i-j+n-1))) > 0 ) { continue; }
            helper( i+1, n, queensRemaining-1, c | (1<<j), d1 | (1<<(i+j)), d2 | (1<<(i-j+n-1)) );
        }
    }
    
    public int totalNQueens(int n) {
        ans = 0;
        helper(0,n,n,0,0,0);
        return ans;
    }
}