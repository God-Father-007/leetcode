class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustedBy = new int[n];
        for( int[] t : trust ) {
            trustedBy[ t[0] - 1 ]--;
            trustedBy[ t[1] - 1 ]++;
        }
        for( int i = 0; i < n; i++ ) {
            if( trustedBy[i] == n-1 ) { return i+1; }
        }
        return -1;
    }
}