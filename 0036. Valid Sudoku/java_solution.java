class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] r = new int[9];
        int[] c = new int[9];
        int[] g = new int[9];

        for( int i = 0; i < 9; i++ ) {
            for( int j = 0; j < 9; j++ ) {
                if( board[i][j] == '.' ) { continue; }
                int v = board[i][j] - '0', x = i/3, y = j/3;
                if( (r[i] & 1 << v) > 0 || (c[j] & 1 << v) > 0 || (g[3*x+y] & 1 << v) > 0 ) { return false; }
                r[i] |= (1 << v);
                c[j] |= (1 << v);
                g[3*x+y] |= (1 << v);
            }
        }
        return true;
    }
}