class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int m = worker.length, n = profit.length, netProfit = 0;
        for( int i = 0; i < m; i++ ) {
            int w = worker[i], wProfit = 0;
            for( int j = 0; j < n; j++ ) {
                if( difficulty[j] <= worker[i] && profit[j] > wProfit ) {
                    wProfit = profit[j];
                }
            }
            netProfit += wProfit;
        }
        return netProfit;
    }
}