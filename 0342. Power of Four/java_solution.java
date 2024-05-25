class Solution {
    public boolean isPowerOfFour(int n) {
        // 1431655765 = 01010101010101010101010101010101
        if( n <= 0 || (n & 1431655765) != n ) { return false; }
        n &= 1431655765;
        return n > 0 && n - (n & -n) == 0;
    }
}