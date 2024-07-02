class Solution {
    public String frequencySort(String s) {
        char[] c = s.toCharArray();
        int[][] dp = new int[123][2];
        for( char x : c ) {
            dp[ (int)x ][0] = (int)x;
            dp[ (int)x ][1]++;
        }
        Arrays.sort( dp, (a,b) -> a[1] < b[1] ? 1 : (a[1] == b[1] ? 0 : -1) );
        StringBuilder ans = new StringBuilder();
        for( int i=0; i < dp.length && dp[i][1] > 0; i++ ) {
            ans.append( ((char)(dp[i][0]) + "").repeat(dp[i][1]) );
        }
        return ans.toString();
    }
}