class Solution {
    
    private ArrayList<Integer> getList( String s ) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0, j=0;
        while( j < s.length() ) {
            int x = s.charAt(i);
            ans.add( x );
            while( j < s.length() && s.charAt(j) == s.charAt(i) ) { j++; }
            ans.add( j-i );
            i = j;
        }
        return ans;
    }
    
    public boolean isLongPressedName(String name, String typed) {
        if( typed.length() < name.length() ) { return false; }
        if( name.length() == typed.length() ) { return name.equals(typed); }
        ArrayList<Integer> n = getList(name);
        ArrayList<Integer> t = getList(typed);
        if( n.size() != t.size() ) { return false; }
        for( int i=0;i<n.size();i+=2 ) {
            if( n.get(i) != t.get(i) ) { return false; }
            if( n.get(i+1) > t.get(i+1) ) { return false; }
        }
        return true;
    }
}