class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
       int carry = 0, i = a.length()-1, j = b.length()-1;
       while(i >= 0 && j >= 0) {
           ans = ((a.charAt(i)-'0')+(b.charAt(j)-'0')+carry)%2 + ans;
           carry = ((a.charAt(i)-'0')+(b.charAt(j)-'0')+carry)/2;
           i--;
           j--;
       }
        while( j>=0 ) {
            ans = ((b.charAt(j)-'0')+carry)%2 + ans;
            carry = ((b.charAt(j)-'0')+carry)/2;
            j--;
        }
        while( i>=0 ) {
            ans = ((a.charAt(i)-'0')+carry)%2 + ans;
            carry = ((a.charAt(i)-'0')+carry)/2;
            i--;
        }
       if(carry == 0) { return ans; } else { return "1"+ans; }
    }
}