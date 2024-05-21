class Solution {

    public boolean isValidSerialization(String preorder) {
        char[] str = preorder.toCharArray();
        Stack<Boolean> st = new Stack<>();
        st.push(true);
        for( int i = 0; i < str.length; i++ ) {
            if( st.size() == 0 ) { return false; }
            if( str[i] == ',' ) { continue; }
            if( str[i] != '#' ) {
                while( i < str.length && str[i] != ',' ) { i++; }
                i--; st.push(false); continue;
            }
            while( st.size() > 0 && st.peek() == true ) { st.pop(); }
            if( st.size() > 0 ) { st.pop(); st.push( true ); }
        }
        return st.size() == 0;
    }
}