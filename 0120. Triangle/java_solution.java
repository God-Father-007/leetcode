class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int r = triangle.size();
        int[] dp = new int[0];
        for( int i = r-1; i >= 0; i-- ) {
            List<Integer> row = triangle.get(i);
            int[] temp = new int[row.size()];
            for( int j = 0; j < row.size(); j++ ) {
                temp[j] = row.get(j) + (i < r-1 ? Math.min( dp[j], dp[j+1] ) : 0) ;
            }
            dp = temp;
        }
        return dp[0];
    }
}