class Solution {
    public int kthGrammar(int n, int k) {
        if( n == 1 ) { return 0; }
        int half = (int)Math.pow(2,n-1) / 2; // half of no. of chars in nth row
        int val = kthGrammar( n-1, k > half ? k - half : k );
        return k > half ? (val + 1) % 2 : val;
    }
}