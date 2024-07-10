class Solution {
    public int findComplement(int num) {
        int ans = 0, power = 1;
        while( num > 0 ) {
            ans = ( (1-num%2)*power )+ans;
            power *= 2;
            num /= 2;
        }
        return ans;
    }
}