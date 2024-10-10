class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length, a = cost[n-2], b = cost[n-1];
        for( int i=n-3; i>=0; i-- ) {
            int c = cost[i] + Math.min( a, b );
            b = a; 
            a = c;
        }
        return Math.min( a,b );
    }
}