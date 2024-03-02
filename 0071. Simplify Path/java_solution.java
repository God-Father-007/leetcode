class Solution {
    public String simplifyPath(String path) {
        String[] p = path.split("/+");
        Stack<Integer> s = new Stack<>();
        for( int i=1; i<p.length; i++ ) {
            if( p[i].equals("..") ) {
                if( s.size() > 0 ) { s.pop(); }
            }
            else if( !p[i].equals(".") ) { s.push(i); }
        }
        StringBuilder ans = new StringBuilder();
        while( s.size() > 0 ) { ans.insert(0,"/"+p[s.pop()]); }
        return ans.length() == 0 ? "/" : ans.toString();
    }
}