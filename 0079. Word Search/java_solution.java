class Solution {
    
    int[][] drxn = { {-1,0}, {0,1}, {1,0}, {0,-1} };
    
    private boolean helper( char[][] a, int r, int c, String word, int idx ) {
        if( idx == word.length() ) { return true; }
        if( r < 0 || c < 0 || r >= a.length || c >= a[0].length ) { return false; }
        if( word.charAt(idx) != a[r][c] ) { return false; }
        char current = a[r][c];
        a[r][c] = '@';
        for( int[] d : drxn ) {
            boolean ans = helper( a, r+d[0], c+d[1], word, idx+1 );
            if( ans ) { a[r][c] = current; return ans; }
        }
        a[r][c] = current;
        return false;
    }
    
    public boolean exist(char[][] board, String word) {
        for( int i=0;i<board.length;i++ ) {
            for( int j=0;j<board[0].length;j++ ) {
                if( word.charAt(0) != board[i][j] ) { continue; }
                boolean ans = helper( board, i, j, word, 0 );
                if( ans ) { return ans; }
            }
        }
        return false;
    }
}