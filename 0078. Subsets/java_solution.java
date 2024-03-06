class Solution {
    
    HashSet<String> set;
    
    private List<List<Integer>> helper( int[] a, int idx, String asf ) {
        List<List<Integer>> ans = new ArrayList<>();
        if( idx == a.length ) {
            if( set.contains(asf) ) { return ans; }
            set.add(asf);
            List<Integer> temp = new ArrayList<>();
            String[] s = asf.split(" ");
            for( String n : s ) {
                if( n.equals("") ) { break; }
                temp.add( Integer.parseInt(n) );
            }
            ans.add(temp);
            return ans;
        }
        ans.addAll( helper( a, idx+1, asf ) );
        ans.addAll( helper( a, idx+1, asf+a[idx]+" " ) );
        return ans;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        set = new HashSet<>();
        return helper( nums, 0, "" );
    }
}