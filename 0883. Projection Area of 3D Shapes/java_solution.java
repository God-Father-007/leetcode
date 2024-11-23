class Solution {
    public int projectionArea(int[][] grid) {
        int ans = 0;
        for( int i=0; i<grid.length; i++ ) {
            int r_max = Integer.MIN_VALUE, c_max = Integer.MIN_VALUE;
            for( int j=0;j<grid[0].length;j++ ) {
                r_max = Math.max( r_max, grid[i][j] );
                c_max = Math.max( c_max, grid[j][i] );
                if( grid[i][j] > 0 ) { ans++; }   // xy plane
            }
            ans += r_max;   // xz plane
            ans += c_max;   // yz plane
        }
        return ans;
    }
}