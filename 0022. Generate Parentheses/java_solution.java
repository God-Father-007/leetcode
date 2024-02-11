class Solution {
    
    HashSet<String> set;
    
    private void helper(int n, int ob, int cb, char last, String asf) {
        if( ob > n || cb > n || cb > ob ) { return; }
        if( ob == n && cb == n ) {
            set.add(asf);
        }
        if( last == ' ' ) {
            helper( n, ob+1, cb, '(', asf+"(" );
        }
        else if( last == '(' ) {
            if( ob < n ) { helper( n, ob+1, cb, '(', asf+"(" ); }
            helper( n, ob, cb+1, ')', asf+")" );
        }
        else {
            if( ob < n ) { helper( n, ob+1, cb, '(', asf+"(" ); }
            if( ob > cb ) { helper( n, ob, cb+1, ')', asf+")" ); }
        }
    }
    
    public List<String> generateParenthesis(int n) {
        set = new HashSet<>();
        helper(n, 0, 0, ' ', "");
        ArrayList<String> ans = new ArrayList<>();
        for( String s : set ) { ans.add(s); }
        return ans;
    }
}