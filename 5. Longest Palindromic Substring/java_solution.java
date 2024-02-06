class Solution {
    public String longestPalindrome(String s) {
        char[] c = s.toCharArray();
        boolean[][] dp = new boolean[c.length][c.length];
        for( int i=0;i<dp.length;i++ ) { dp[i][i] = true; }
        int j = 1, i = dp.length-j-1, start = 0, end = 0;
        while( j < dp.length ) {
            dp[i][i+j] = j == 1 ? (c[i] == c[i+j]) : (c[i] == c[i+j] && dp[i+1][i+j-1]);
            if( dp[i][i+j] ) { start = i; end = i+j; }
            i--;
            if( i < 0 ) { j++; i = dp.length-j-1; }
        }
        return s.substring(start,end+1);
    }
}