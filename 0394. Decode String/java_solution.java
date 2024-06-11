class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        char[] c = s.toCharArray();
        for( int i=0; i<c.length; i++ ) {
            if( c[i] == '[' ) { st.push(""); continue; }
            if( c[i] == ']' ) {
                StringBuilder str = new StringBuilder();
                while( !st.peek().equals("") ) { str.insert(0,st.pop()); }
                st.pop();
                int num = Integer.parseInt( st.pop() );
                st.push( str.toString().repeat(num) );
                continue;
            }
            if( c[i] >= '0' && c[i] <= '9' ) {
                String str = getPart(c, '0', '9', i);
                st.push( str );
                i += str.length() - 1;
                continue;
            }
            String str = getPart(c, 'a', 'z', i);
            st.push( str );
            i += str.length() - 1;
        }
        StringBuilder str = new StringBuilder();
        while( st.size() > 0 ) { str.insert(0,st.pop()); }
        return str.toString();
    }

    private String getPart(char[] c, char l, char r, int j) {
        StringBuilder str = new StringBuilder();
        while( j < c.length && c[j] >= l && c[j] <= r ) {
            str.append( c[j] ); j++;
        }
        return str.toString();
    }
}