class Solution {
    public int numDecodings(String s) {
        char[] c = s.toCharArray();
        int[] dp = new int[c.length+1];
        long mod = 1000000007;
        dp[c.length] = 1;
        dp[c.length - 1] = c[c.length-1] == '0' ? 0 : ( c[c.length-1] == '*' ? 9 : 1 ) ;
        for( int i = c.length-2; i >= 0; i-- ) {
            long val = 0;
            if( c[i] == '*' ) {
                val = 9L*dp[i+1];
                long choices = 1;
                if( c[i+1] == '*' ) { choices = 15; }
                else if( c[i+1] < '7' ) { choices = 2; }
                val += choices * dp[i+2] ;
            } else if( c[i] != '0' ) {
                val = dp[i+1];
                long choices = 0;
                if( c[i] <= '2' && c[i+1] == '*' ) { choices = c[i] == '1' ? 9 : 6 ; }
                else if( c[i] <= '2' && c[i] == '1' || (c[i] == '2' && c[i+1] < '7') ) { choices = 1; }
                val += choices * dp[i+2] ;
            }
            dp[i] = (int)(val % mod);
        }
        return dp[0];
    }
}