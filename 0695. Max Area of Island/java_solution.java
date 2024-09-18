class Solution {
    
    private int getArea(int[][]a, int r, int c) {
        if( r<0 || r==a.length || c<0 || c==a[0].length || a[r][c]==0 ) { return 0; }
        a[r][c] = 0;
        int ans = 1;
        int[][] drxn = { {-1,0}, {0,1}, {1,0}, {0,-1} };
        for( int[] d : drxn ) {
            ans += getArea(a,r+d[0],c+d[1]);
        }
        return ans;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for( int r=0;r<grid.length;r++ ) {
            for( int c=0;c<grid[0].length;c++ ) {
                if( grid[r][c] == 1 ) { res = Math.max( res, getArea(grid,r,c) ); }
            }
        }
        return res;
    }
}