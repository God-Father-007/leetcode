class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if( n < k || n < 1 ) { return ans; }
        if( k == 1 ) {
            for( int i=1;i<=n;i++ ) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                ans.add(temp);
            }
            return ans;
        }
        ans = combine( n-1, k-1 );
        for( int i=0;i<ans.size();i++ ) {
            List<Integer> al = ans.get(i);
            al.add(n);
            ans.set( i, al );
        }
        ans.addAll( combine( n-1, k ) );
        return ans;
    }
}