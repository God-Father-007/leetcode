class Solution {
    public String[] findWords(String[] words) {
        String q = "qwertyuiop", a = "asdfghjkl", z = "zxcvbnm";
        ArrayList<String> al = new ArrayList<>();
        for( String t : words ) {
            boolean flag = false;
            if( !flag ) {
                String s = t.toLowerCase();
                for( int i=0;i<q.length();i++ ) {
                    s = s.replaceAll( q.charAt(i)+"","" );
                    if( s.equals("") ) { al.add( t ); flag = true; break; }
                }
            }
            if( !flag ) {
                String s = t.toLowerCase();
                for( int i=0;i<a.length();i++ ) {
                    s = s.replaceAll( a.charAt(i)+"","" );
                    if( s.equals("") ) { al.add( t ); flag = true; break; }
                }
            }
            if( !flag ) {
                String s = t.toLowerCase();
                for( int i=0;i<z.length();i++ ) {
                    s = s.replaceAll( z.charAt(i)+"","" );
                    if( s.equals("") ) { al.add( t ); flag = true; break; }
                }
            }
        }
        String[] ans = new String[al.size()];
        for( int i=0;i<al.size();i++ ) { ans[i] = al.get(i); }
        return ans;
    }
}