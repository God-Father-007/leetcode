class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if( duration == 0 ) { return 0; }
        int ans = 0, l = timeSeries[0], r = timeSeries[0];
        for( int time : timeSeries ) {
            if( time > r ) {
                ans += r - l + 1;
                l = time;
            }
            r = time + duration - 1;
        }
        ans += r - l + 1;
        return ans;
    }
}