class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 1;
        while( n > 0 ) {
            a += b;
            a ^= b;
            b ^= a;
            a ^= b;
            n--;
        }
        return b;
    }
}