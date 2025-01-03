class Solution {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        for( int i=0;i<board.length;i++ ) {
            for( int j=0;j<board[0].length;j++ ) {
                if( board[i][j] != 'R' ) { continue; }
                int y=i-1, x=j;
                while( y >= 0 ) {
                    if( board[y][x] != '.' ) {
                        if( board[y][x] == 'p' ) { count++; }
                        break;
                    }
                    y--;
                }
                y=i+1; x=j;
                while( y < board.length ) {
                    if( board[y][x] != '.' ) {
                        if( board[y][x] == 'p' ) { count++; }
                        break;
                    }
                    y++;
                }
                y=i; x=j-1;
                while( x >= 0 ) {
                    if( board[y][x] != '.' ) {
                        if( board[y][x] == 'p' ) { count++; }
                        break;
                    }
                    x--;
                }
                y=i; x=j+1;
                while( x < board.length ) {
                    if( board[y][x] != '.' ) {
                        if( board[y][x] == 'p' ) { count++; }
                        break;
                    }
                    x++;
                }
                break;
            }
        }
        return count;
    }
}