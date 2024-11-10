class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length, n = grid[0].length, ans = 0;
        for( int i = 0; i < m-2; i++ ) {
            for( int j = 0; j < n-2; ) {
                if( isSquare(grid, i, j) ) {
                    ans++;
                    j += 3;
                } else {
                    j++;
                }
            }
        }
        return ans;
    }

    private boolean isSquare( int[][] a, int i, int j ) {
        Set<Integer> s = new HashSet<>();
        for( int r = i; r < i+3; r++ ) {
            for( int c = j; c < j+3; c++ ) {
                if( a[r][c] == 0 || a[r][c] > 9 ) { return false; }
                s.add(a[r][c]);
            }
        }
        if( s.size() != 9 ) { return false; }
        int r1 = a[i][j] + a[i][j+1] + a[i][j+2];
        int r2 = a[i+1][j] + a[i+1][j+1] + a[i+1][j+2];
        int r3 = a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
        int c1 = a[i][j] + a[i+1][j] + a[i+2][j];
        int c2 = a[i][j+1] + a[i+1][j+1] + a[i+2][j+1];
        int c3 = a[i][j+2] + a[i+1][j+2] + a[i+2][j+2];
        int d1 = a[i][j] + a[i+1][j+1] + a[i+2][j+2];
        int d2 = a[i][j+2] + a[i+1][j+1] + a[i+2][j];
        return r1 == r2 && r2 == r3 && r3 == c1 && c1 == c2 && c2 == c3 && c3 == d1 && d1== d2;
    }
}