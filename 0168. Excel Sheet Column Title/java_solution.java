class Solution {
    public String convertToTitle(int n) {
        String ans = "";
        while( n>0 ) {
            if( n%26 == 0 ) { ans = 'Z'+ans; n--; }
            else { ans = (char)((n%26)+'@') + ans; }
            n /= 26;
        }
        return ans;
    }
}