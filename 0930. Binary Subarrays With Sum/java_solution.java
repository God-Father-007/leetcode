class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> sumFreq = new HashMap<>();
        sumFreq.put( 0, 1 );
        int sum = 0, ans = 0;
        for( int i = 0; i < nums.length; i++ ) {
            sum += nums[i];
            if( sum >= goal ) { ans += sumFreq.getOrDefault( sum - goal, 0 ); }
            sumFreq.put( sum, sumFreq.getOrDefault( sum, 0 ) + 1 );
        }
        return ans;
    }
}