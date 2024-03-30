class Solution {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        int l = s.length();
        boolean[][] dp = new boolean[l][l];
        StringBuilder sb = new StringBuilder(s);
        Set<String> set = new HashSet<>( wordDict );
        for( int i=l-1; i>=0; i-- ) {
            for( int j=l-1; j>=i; j-- ) {
                String x = sb.substring(i,j+1);
                dp[i][j] = j < l-1 ? ( dp[i][j+1] |= ( dp[j+1][j+1] & set.contains(x) ) ) : set.contains(x);
            }
        }
        return dp[0][0];
    }
    
}