class Solution {
    
    private String getSum( String a, String b ) {
        int i=a.length()-1, j=b.length()-1, carry = 0;
        String ans = "";
        while( i >= 0 && j >= 0 ) {
            int p = a.charAt(i)-'0', q = b.charAt(j)-'0';
            ans = (p+q+carry)%10 + ans;
            carry = (p+q+carry)/10;
            i--; j--;
        }
        while( i >= 0 ) {
            int p = a.charAt(i)-'0';
            ans = (p+carry)%10 + ans;
            carry = (p+carry)/10;
            i--;
        }
        while( j >= 0 ) {
            int q = b.charAt(j)-'0';
            ans = (q+carry)%10 + ans;
            carry = (q+carry)/10;
            j--;
        }
        if( carry > 0 ) { ans = carry + ans; }
        return ans;
    }
    
    public String multiply(String num1, String num2) {
        if( num1.equals("0") || num2.equals("0") ) { return "0"; }
        String ans = "", place = "";
        for( int i=num1.length()-1;i>=0;i-- ) {
            int a = num1.charAt(i)-'0', carry = 0;
            String temp = place;
            for( int j=num2.length()-1;j>=0;j-- ) {
                int b = num2.charAt(j)-'0';
                temp = ((a*b)+carry)%10 + temp;
                carry = ((a*b)+carry)/10;
            }
            if( carry > 0 ) { temp = carry + temp; }
            if( ans.equals("") ) { ans = temp; }
            else { ans = getSum(ans,temp); }
            place += "0";
        }
        return ans;
    }
}