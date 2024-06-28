class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for( int v : nums ) {
            v = Math.abs(v);
            if( nums[v-1] < 0 ) { ans.add(v); }
            nums[v-1] = -nums[v-1];
        }
        return ans;
    }
}