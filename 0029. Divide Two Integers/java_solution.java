class Solution {
    public int divide(int dividend, int divisor) {
        if( divisor == 1 ) { return dividend; }
        if( divisor == -1 ) { return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend; }
        long a = Math.abs((long)dividend), b = Math.abs((long)divisor);
        if( a == 0 || a < b ) { return 0; }
        int q = 0, count = 0;
        while( b << count <= a ) { count++; }
        q = (int)Math.pow(2,count-1);
        a -= b << (count - 1) ;
        q += divide((int)a,(int)b);
        return dividend < 0 ^ divisor < 0 ? -q : q ;
    }
}