class Solution {
    public int surfaceArea(int[][] grid) {
        int ans = 0;
        for( int i=0;i<grid.length;i++ ) {
            for( int j=0;j<grid[0].length;j++ ) {
                if( grid[i][j] == 0 ) { continue; }
                ans += grid[i][j]*6 - (grid[i][j] - 1)*2;
                if( i > 0 && grid[i-1][j] > 0 ) { ans -= Math.min(grid[i][j], grid[i-1][j]); }
                if( i < grid.length-1 && grid[i+1][j] > 0 ) { ans -= Math.min(grid[i][j], grid[i+1][j]); }
                if( j > 0 && grid[i][j-1] > 0 ) { ans -= Math.min(grid[i][j], grid[i][j-1]); }
                if( j < grid[0].length-1 && grid[i][j+1] > 0 ) { ans -= Math.min(grid[i][j], grid[i][j+1]); }
            }
        }
        return ans;
    }
}