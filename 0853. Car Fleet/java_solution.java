class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] data = new double[n][2];
        for( int i=0;i<n;i++ ) {
            data[i][0] = position[i];
            data[i][1] = (target-position[i])*1d/speed[i];
        }
        Arrays.sort(data,(a,b) -> (Double.compare(a[0],b[0])));
        int ans = 1;
        double tt = data[n-1][1];
        for( int i=n-2;i>=0;i-- ) {
            if( data[i][1] > tt ) {
                ans++;
                tt = data[i][1];
            }
        }
        return ans;
    }
}