class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=num.length-1, carry = 0;
        while( i >= 0 && k > 0 ) {
            int m = k%10;
            ans.add( (num[i]+carry+m)%10 );
            carry = (num[i]+carry+m)/10;
            k /= 10;
            i--;
        }
        while( k > 0 ) {
            int m = k%10;
            ans.add( (carry+m)%10 );
            carry = (carry+m)/10;
            k /= 10;
        }
        while( i >= 0 ) {
            ans.add( (num[i]+carry)%10 );
            carry = (num[i]+carry)/10;
            i--;
        }
        if( carry > 0 ) { ans.add(carry); }
        Collections.reverse(ans);
        return ans;
    }
}