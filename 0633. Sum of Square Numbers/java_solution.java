class Solution {
    public boolean judgeSquareSum(int c) {
        for( int i = 0; i*i <= c/2; i++ ) {
            double sq = Math.sqrt( c - i*i );
            if( sq == (int)sq ) { return true; }
        }
        return false;
    }
}