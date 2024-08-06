class Solution {
    public int arrayNesting(int[] nums) {
        int ans = 0;
        for( int i = 0; i < nums.length; i++ ) {
            int k = i;
            Set<Integer> set = new HashSet<>();
            while( nums[k] != nums.length && !set.contains( nums[k] ) ) {
                set.add( nums[k] );
                int idx = k;
                k = nums[k];
                nums[idx] = nums.length;
            }
            ans = Math.max( ans, set.size() );
        }
        return ans;
    }
}