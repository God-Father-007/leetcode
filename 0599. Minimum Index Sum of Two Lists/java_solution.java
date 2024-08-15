class Solution {
    
    public int search( String[] s, String k ) {
        for( int i=0;i<s.length;i++ ) {
            if( k.equals( s[i] ) ) { return i; }
        }
        return -1;
    }
    
    public String[] findRestaurant(String[] list1, String[] list2) {
        int m = Integer.MAX_VALUE;
        ArrayList<String> a = new ArrayList<>();
        for( int i=0;i<list1.length;i++ ) {
            int j = search( list2 , list1[i] );
            if( j < 0 || i+j > m ) { continue; }
            if( i+j < m ) { a.clear(); m = i+j; }
            a.add( list1[i] );
        }
        String[] ans = new String[a.size()];
        for( int i=0;i<a.size();i++ ) { ans[i] = a.get(i); }
        return ans;
    }
}