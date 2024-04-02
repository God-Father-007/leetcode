class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for( String v : tokens ) {
            char c = v.charAt( v.length() - 1 );
            if( c > 47 ) { s.push( Integer.parseInt(v) ); }
            else { s.push( calc( s.pop(), s.pop(), c ) ); }
        }
        return s.pop();
    }

    private int calc( int b, int a, char sign ) {
        if( sign == '+' ) { return a+b; }
        if( sign == '-' ) { return a-b; }
        if( sign == '/' ) { return a/b; }
        return a*b;
    }

}