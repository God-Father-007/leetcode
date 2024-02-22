class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        solve( nums, new boolean[nums.length], new ArrayList<>(), 0 );
        return ans;
    }

    private void solve(int[] nums, boolean[] picked, ArrayList<Integer> asf, int c) {
        if( c == nums.length ) {
            ans.add( new ArrayList<>(asf) );
            return;
        }
        for( int i=0; i<nums.length; i++ ) {
            if( picked[i] ) { continue; }
            picked[i] = true;
            asf.add( nums[i] );
            solve( nums, picked, asf, c+1 );
            asf.remove( asf.size() - 1 );
            picked[i] = false;
        }
    }
}