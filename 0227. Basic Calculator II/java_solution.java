class Solution {
    public int calculate(String str) {
        char sign = '+';
        Stack<Integer> s = new Stack<>();
        for( int i=0;i<str.length();i++ ) {
            char c = str.charAt(i);
            if( Character.isDigit(c) ) {
                int val = 0;
                while( i < str.length() && Character.isDigit( str.charAt(i) ) ) {
                    val = val*10 + ( str.charAt(i)-'0' );
                    i++;
                }
                i--;
                if( sign == '+' ) {
                    s.push(val);
                } else if( sign == '-' ) {
                    s.push(-val);
                } else if( sign == '*' ) {
                    s.push( s.pop()*val );
                } else if( sign == '/' ) {
                    s.push( s.pop()/val );
                }
            } else if( c != ' ' ) {
                sign = c;
            }
        }
        int sum = 0;
        while( s.size() > 0 ) { sum += s.pop(); }
        return sum;
    }
}