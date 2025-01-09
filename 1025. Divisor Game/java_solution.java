class Solution {
    
    private boolean helper( int n, boolean alice ) {
        if( n == 1 ) { return !alice; }
        for( int i=1;i*i<n;i++ ) {
            if( n%i != 0 ) { continue; }
            return helper( n-i, !alice );
        }
        return false;
    }
    
    public boolean divisorGame(int n) {
        return helper( n, true );
    }
}