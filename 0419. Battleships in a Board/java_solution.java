class Solution {
    public int countBattleships(char[][] board) {
        int ans = 0;
        for( int i=0;i<board.length;i++ ) {
            for( int j=0;j<board[0].length;j++ ) {
                if( board[i][j] == '.' ) { continue; }
                if( i == 0 && j == 0 ) { ans++; }
                else if( i == 0 && j > 0 ) { ans += board[i][j-1] == 'X' ? 0 : 1 ; }
                else if( i > 0 && j == 0 ) { ans += board[i-1][j] == 'X' ? 0 : 1 ; }
                else { ans += board[i][j-1] == 'X' || board[i-1][j] == 'X' ? 0 : 1 ; }
            }
        }
        return ans;
    }
}