class Solution {
    public int rotatedDigits(int n) {
        int ans = 0;
        for( int i = 2; i <= n; i++ ) {
            int rot = 0, pow = 1;
            boolean valid = true;
            for( int x = i; x > 0; x /= 10 ) {
                int d = x % 10;
                if( d == 3 || d == 4 || d == 7 ) { valid = false; break; }
                rot += pow*flip(d);
                pow *= 10;
            }
            if( valid && i != rot ) { ans++; }
        }
        return ans;
    }

    private int flip( int x ) {
        switch(x) {
            case 2:
                return 5;
            case 5:
                return 2;
            case 6:
                return 9;
            case 9:
                return 6;
        }
        return x;
    }
}