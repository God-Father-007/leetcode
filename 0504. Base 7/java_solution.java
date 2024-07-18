class Solution {
    public String convertToBase7(int num) {
        if( num == 0 ) { return "0"; }
        boolean neg = num < 0;
        String ans = "";
        num = Math.abs(num);
        while( num > 0 ) {
            ans = num%7 + ans;
            num /= 7;
        }
        if( neg ) { ans = "-"+ans; }
        return ans;
    }
}