class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n==1 ){ return true; }
        else if( n<1 || n%2 == 1) { return false; }
        return isPowerOfTwo( n/2 );
    }
}