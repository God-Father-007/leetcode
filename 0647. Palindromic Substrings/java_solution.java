class Solution {
    public int countSubstrings(String s) {
        char[] c = s.toCharArray();
        boolean[][] dp = new boolean[c.length][c.length];
        int i = 0, j = 0, ans = 0;
        while( j < c.length ) {
            if( c[i] == c[i+j] ) {
                dp[i][i+j] = j < 2 ? true : dp[i+1][i+j-1] ;
            }
            ans += dp[i][i+j] ? 1 : 0 ;
            i++;
            if( i+j == c.length ) { i = 0; j++; }
        }
        return ans;
    }
}