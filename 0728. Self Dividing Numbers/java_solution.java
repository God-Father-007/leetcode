class Solution {
    
    private boolean check( int i ) {
        int temp = i;
        while( temp > 0 ) {
            int x = temp%10;
            if( x == 0 || i%x != 0 ) { return false; }
            temp /= 10;
        }
        return true;
    }
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for( int i=left;i<=right;i++ ) {
            if( check( i ) ) { ans.add(i); }
        }
        return ans;
    }
}