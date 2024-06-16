class Solution {
    public String toHex(int num) {
        if( num == 0 ) { return "0"; }
        boolean neg = false;
        if( num < 0 ) { neg = true; }
        String ans = "";
        int carry = 1;
        while( true ) {
            int i = num%16;
            if( neg ) { i = i + 15 + carry; }
            if( i > 9 && i < 16 ) { ans = (char)( (char)i + 'W' ) + ans; }
            else if( i == 16 ) { ans = "0" + ans; }
            else { ans = i + ans; }
            carry = i/16;
            num /= 16;
            if( num == 0 ) { break; }
        }
        if(neg) {
            int l = ans.length();
            for( int i=0;i<8-l;i++ ) { ans = "f" + ans; }
        }
        return ans;
    }
}