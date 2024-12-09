class Solution {
    public int minAddToMakeValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for( char x : c ) {
            if( x == '(' ) {
                st.push(x);
            } else {
                if( st.size() > 0 ) { st.pop(); }
                else { ans++; }
            }
        }
        return ans + st.size();
    }
}