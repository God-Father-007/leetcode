class Solution {
    public int tribonacci(int n) {
        int a = 0, b = 1, c = 1;
        if( n < 3 ) { return n == 0 ? 0 : 1 ; }
        while( n > 2 ) {
            int d = a + b + c ;
            a = b; b = c; c = d;
            n--;
        }
        return c;
    }
}