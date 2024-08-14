class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if( ops.length == 0 ) { return m*n; }
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for( int[] d : ops ) {
            a = Math.min( a,d[0] );
            b = Math.min( b,d[1] );
        }
        return a*b;
    }
}