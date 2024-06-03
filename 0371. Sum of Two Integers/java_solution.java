class Solution {
    public int getSum(int a, int b) {
        char[] p = Integer.toBinaryString(a).toCharArray();
        char[] q = Integer.toBinaryString(b).toCharArray();
        int i = p.length-1, j = q.length-1, carry = 0;
        StringBuilder s = new StringBuilder();
        while( i >= 0 && j >= 0 ) {
            char c = (char)((carry ^ (q[j]-'0') ^ (p[i]-'0')) + '0');
            if( p[i] == '0' ) { carry &= (q[j]-'0'); }
            else { carry |= (q[j]-'0'); }
            s.insert(0,c);
            i--; j--;
        }
        while( i >= 0 ) {
            char c = (char)((carry ^ (p[i]-'0')) + '0');
            carry &= (p[i]-'0');
            s.insert(0,c);
            i--;
        }
        while( j >= 0 ) {
            char c = (char)((carry ^ (q[j]-'0')) + '0');
            carry &= (q[j]-'0');
            s.insert(0,c);
            j--;
        }
        if( carry > 0 ) {
            s.insert(0,carry+"");
        }
        return (int)Long.parseLong( s.substring( s.length() > 32 ? s.length() - 32 : 0 ), 2 );
    }
}