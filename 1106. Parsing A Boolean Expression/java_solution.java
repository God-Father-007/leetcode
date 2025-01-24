class Solution {
    public boolean parseBoolExpr(String expression) {
        char[] c = expression.toCharArray();
        Stack<Boolean> ans = new Stack<>();
        Stack<Character> op = new Stack<>();
        for( char x : c ) {
            if( x == '(' || x == ',' ) { continue; }
            if( x == '!' || x == '&' || x == '|' ) {
                op.push(x);
                ans.push( x == '|' ? false : true );
                continue;
            }
            if( x == 'f' || x == 't' ) {
                char o = op.peek();
                ans.push( eval( o, ans.pop(), x == 'f' ? false : true ) );
                continue;
            }
            op.pop();
            if( op.size() == 0 ) { break; }
            ans.push( eval( op.peek(), ans.pop(), ans.pop() ) );
        }
        return ans.pop();
    }

    private boolean eval( char op, boolean a, boolean b ) {
        if( op == '&' ) { return a && b; }
        if( op == '|' ) { return a || b; }
        return a ^ b;
    }
}