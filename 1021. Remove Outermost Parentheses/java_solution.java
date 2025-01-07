class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        for( int i=0;i<s.length();i++ ) {
            char c = s.charAt(i);
            if( c == '(' ) {
                if( st.size() > 0 ) { ans += c; }
                st.push(c);
            } else{
                if( st.size() > 1 ) { ans += c; }
                st.pop();
            }
        }
        return ans;
    }
}