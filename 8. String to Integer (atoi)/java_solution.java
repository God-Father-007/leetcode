class Solution {
    public int myAtoi(String s) {
        char[] c = s.trim().toCharArray();
        if( c.length == 0 ) { return 0; }
        long ans = 0;
        int i = c[0]=='-' || c[0]=='+' ? 1 : 0, neg = c[0]=='-' ? -1 : 1;
        for( ; i < c.length; i++ ) {
            if( c[i] < '0' || c[i] > '9' ) { break; }
            ans = ans * 10 + ( c[i] - '0' ) ;
            if( ans > Integer.MAX_VALUE ) {
                ans = Integer.MAX_VALUE + (neg == -1 ? 1 : 0); break;
            }
        } 
        return (int)ans*neg;
    }
}