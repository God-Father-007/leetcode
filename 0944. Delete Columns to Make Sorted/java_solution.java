class Solution {
    
    private void f( String a, String b, HashSet<Integer> s ) {
        for( int i=0;i<a.length();i++ ) {
            if( a.charAt(i) > b.charAt(i) ) {
                if( s.contains(i) ) { continue; }
                s.add(i);
            }
        }
    }
    
    public int minDeletionSize(String[] strs) {
        HashSet<Integer> cols = new HashSet<>();
        for( int i=0;i<strs.length-1;i++ ) {
            f(strs[i], strs[i+1], cols);
            if( cols.size() == strs[0].length() ) { return cols.size(); }
        }
        return cols.size();
    }
}