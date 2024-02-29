class Solution {
    public int[] plusOne(int[] digits) {
        if( Arrays.toString(digits).replaceAll("\\[|\\]|,|\\s", "").replaceAll("9","").length() == 0 ) {
            int[] a = new int[digits.length+1];
            a[0] = 1;
            return a;
        }
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--) {
            if( carry == 1 ) { 
                digits[i] += 1; 
                carry = digits[i]/10;
                digits[i] %= 10;
            }
            if( carry == 0 ) { return digits; }
        }
        return digits;
    }
}