class Solution {
    
    HashSet<List<Integer>> set;
    
    private List<List<Integer>> helper( int[] a, int idx ) {
        List<List<Integer>> ans = new ArrayList<>();
        if( idx == a.length ) {
            set.add( new ArrayList<Integer>() );
            ans.add( new ArrayList<Integer>() );
            return ans;
        }
        ans.addAll( helper( a, idx+1 ) );
        List<List<Integer>> curr = new ArrayList<>();
        for( int i=0;i<ans.size();i++ ) {
            List<Integer> temp = new ArrayList<>();
            temp.add(a[idx]);
            temp.addAll( ans.get(i) );
            Collections.sort(temp);
            if( set.contains( temp ) ) { continue; }
            set.add(temp);
            curr.add(temp);
        }
        ans.addAll(curr);
        return ans;
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        set = new HashSet<>();
        return helper( nums, 0 );
    }
}