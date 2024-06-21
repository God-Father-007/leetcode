class Solution {
    public String addStrings(String num1, String num2) {
        String ans = "";
        int i=num1.length()-1, j=num2.length()-1, carry = 0;
        while( i >= 0 && j >= 0 ) {
            int l1 = num1.charAt(i)-'0', l2 = num2.charAt(j)-'0';
            ans = (l1+l2+carry)%10 + ans;
            carry = (l1+l2+carry)/10;
            i--;
            j--;
        }
        while( i >= 0 ) {
            int l1 = num1.charAt(i)-'0';
            ans = (l1+carry)%10 + ans;
            carry = (l1+carry)/10;
            i--;
        }
        while( j >= 0 ) {
            int l2 = num2.charAt(j)-'0';
            ans = (l2+carry)%10 + ans;
            carry = (l2+carry)/10;
            j--;
        }
        if( carry > 0 ) { ans = carry+ans; }
        return ans;
    }
}