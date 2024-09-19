class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> m = new HashMap<>();
        int f = 0;
        for( int i = 0; i < nums.length; i++ ) {
            if( !m.containsKey( nums[i] ) ) {
                m.put( nums[i], new int[]{i, 0, 0} );
            }
            int[] data = m.get(nums[i]);
            data[1] = i - data[0] + 1;
            data[2]++;
            f = Math.max( f, data[2] );
        }
        int ans = 50000;
        for( int key : m.keySet() ) {
            int[] data = m.get( key );
            if( data[2] != f ) { continue; }
            ans = Math.min( ans, data[1] );
        }
        return ans;
    }
}