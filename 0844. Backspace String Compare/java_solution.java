class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a = type(s), b = type(t);
        return a.equals(b);
    }

    private String type( String s ) {
        char[] c = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for( char x : c ) {
            if( x != '#' ) { ans.append(x); }
            else if( ans.length() > 0 ) {
                ans.deleteCharAt( ans.length()-1 );
            }
        }
        return ans.toString();
    }
}