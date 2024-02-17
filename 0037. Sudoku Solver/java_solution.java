class Solution {
    public void solveSudoku(char[][] board) {
        int[] r = new int[9];
        int[] c = new int[9];
        int[] b = new int[9];
        for( int i = 0; i < board.length; i++ ) {
            for( int j = 0; j < board.length; j++ ) {
                if( board[i][j] != '.' ) {
                    int v = board[i][j] - '0';
                    r[i] |= 1 << v; c[j] |= 1 << v; b[3 * (i/3) + j/3] |= 1 << v;
                }
            }
        }
        helper( board, 0, r, c, b );
    }

    private boolean helper( char[][] board, int idx, int[] r, int[] c, int[] b ) {
        if( idx > 80 ) {
            return check(r) && check(c) && check(b) ;
        }
        int i = idx / 9, j = idx % 9;
        if( board[i][j] != '.' ) {
            return helper( board, idx + 1, r, c, b );
        }
        for( int p=1; p<10; p++ ) {
            int mask = 1 << p, x = 3 * (i/3) + j/3;
            if( (r[i] & mask) > 0 || (c[j] & mask) > 0 || (b[x] & mask) > 0 ) { continue; }
            r[i] |= mask; c[j] |= mask; b[x] |= mask;
            board[i][j] = (char)(p + '0');
            boolean ans = helper( board, idx + 1, r, c, b );
            if( ans ) { return true; }
            board[i][j] = '.';
            r[i] &= ~mask; c[j] &= ~mask; b[x] &= ~mask;
        }
        return false;
    }
    private boolean check( int[] a ) {
        for( int v : a ) {
            if( v != 1022 ) { return false; }
        }
        return true;
    }
}