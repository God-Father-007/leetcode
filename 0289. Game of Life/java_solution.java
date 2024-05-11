class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] ans = new int[m][n];
        for( int i=0; i<m; i++ ) {
            for( int j=0; j<n; j++ ) {
                int o = countLiveNeighbours( board, i, j );
                if( board[i][j] == 1 ) {
                    ans[i][j] = o < 2 || o > 3 ?0 : 1 ;;
                }
                if( board[i][j] == 0 && o == 3 ) { ans[i][j] = 1; }
            }
        }
        for( int i=0; i<m; i++ ) { board[i] = ans[i]; }
    }

    private int countLiveNeighbours(int[][] b, int i, int j) {
        int ans = 0;
        if( i > 0 && b[i-1][j] == 1 ) { ans++; }
        if( i < b.length-1 && b[i+1][j] == 1 ) { ans++; }
        if( j > 0 && b[i][j-1] == 1 ) { ans++; }
        if( j < b[0].length-1 && b[i][j+1] == 1 ) { ans++; }
        if( i > 0 && j > 0 && b[i-1][j-1] == 1 ) { ans++; }
        if( i > 0 && j < b[0].length-1 && b[i-1][j+1] == 1 ) { ans++; }
        if( i < b.length-1 && j < b[0].length-1 && b[i+1][j+1] == 1 ) { ans++; }
        if( i < b.length-1 && j > 0 && b[i+1][j-1] == 1 ) { ans++; }
        return ans;
    }
}