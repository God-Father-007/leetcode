class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort( heaters );
        int ans = 0;
        for( int h : houses ) {
            int i = Arrays.binarySearch( heaters, h ), min = Integer.MAX_VALUE;
            if( i >= 0 ) { continue; }
            i = Math.abs( i+1 );
            if( i > 0 ) { min = Math.min( min, h - heaters[i-1] ); }
            if( i < heaters.length ) { min = Math.min( min, heaters[i] - h ); }
            ans = Math.max( ans, min );
        }
        return ans;
    }
}