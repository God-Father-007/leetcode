class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] a = parse( num1 );
        int[] b = parse( num2 );
        return (a[0]*b[0] - a[1]*b[1]) + "+" + (a[0]*b[1] + a[1]*b[0]) + "i" ;
    }

    private int[] parse( String n ) {
        char[] c = n.toCharArray();
        int[] num = new int[2];
        int i = 0, s = 0;
        for( int x = 0; x < 2; x++ ) {
            s = c[i] == '-' ? -1 : 1; i += s == -1 ? 1 : 0 ;
            while( c[i] != (x == 0 ? '+' : 'i') ) {
                num[x] = num[x] * 10 + ( c[i] - '0' ); i++;
            }
            num[x] *= s;
            i++;
        }
        return num;
    }
}