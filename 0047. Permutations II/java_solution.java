class Solution {

    List<List<Integer>> ans;

    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        solve( nums, new boolean[nums.length], new ArrayList<>(), 0 );
        return ans;
    }

    private void solve(int[] nums, boolean[] picked, ArrayList<Integer> asf, int c) {
        if( c == nums.length ) {
            ans.add( new ArrayList<>(asf) );
            return;
        }
        Set<Integer> s = new HashSet<>();
        for( int i=0; i<nums.length; i++ ) {
            if( picked[i] || s.contains(nums[i]) ) { continue; }
            s.add( nums[i] );
            picked[i] = true;
            asf.add(nums[i]);
            solve( nums, picked, asf, c+1 );
            asf.remove(  asf.size() - 1 );
            picked[i] = false;
        }
    }
}