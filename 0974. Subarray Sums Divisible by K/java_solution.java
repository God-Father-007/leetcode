class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length, sum = 0, ans = 0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put( 0, 1 );
        for( int i = 0; i < n; i++ ) {
            sum += nums[i];
            int mod = sum % k;
            if( mod < 0 ) { mod += k; }
            int x = m.getOrDefault( mod, 0 );
            ans += x;
            m.put( mod, x+1 );
        }
        return ans;
    }
}