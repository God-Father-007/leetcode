class Solution {
    public boolean hasAlternatingBits(int n) {
        int num = 0, l = Integer.toBinaryString(n).length();
        int mask = 1<<(l-1), b = 1;
        for( int i=0;i<l;i++ ) {
            int val = (n & mask) == 0? 0 : 1;
            if( val != b ) { return false; }
            b ^= 1;
            mask >>= 1;
        }
        return true;
    }
}