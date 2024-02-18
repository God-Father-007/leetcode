class Solution {
    
    List<List<Integer>> ans;
    
    private void helper( int[] a, int idx, int tar, String asf ) {
        if( tar < 0 ) { return; }
        if( tar == 0 ) {
            String[] temp = asf.split(" ");
            ArrayList<Integer> set = new ArrayList<>();
            for( String s : temp ) { set.add( Integer.parseInt(s) ); }
            ans.add(set);
            return;
        }
        if( idx == a.length ) { return; }
        int sum = a[idx];
        String curr = "";
        while( sum <= tar ) {
            curr += a[idx] + " ";
            helper( a, idx+1, tar-sum, asf + curr );
            sum += a[idx];
        }
        helper( a, idx+1, tar, asf );
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        helper(candidates, 0, target, "");
        return ans;
    }
}