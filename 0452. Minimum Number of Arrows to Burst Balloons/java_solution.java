class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort( points, (a,b) -> Integer.compare(a[0],b[0]) );
        int s = Integer.MIN_VALUE, e = Integer.MAX_VALUE, ans = 1;
        for( int[] p : points ) {
            if( e < p[0] ) { ans++; s = p[0]; e = p[1]; continue; }
            s = p[0];
            if( p[1] < e ) { e = p[1]; }
        }
        return ans;
    }
}