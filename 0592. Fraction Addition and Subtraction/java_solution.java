class Solution {
    public String fractionAddition(String expression) {
        char[] c = expression.toCharArray();
        List<Integer> l = new LinkedList<>();
        long lcm = 1;
        for( int i = 0; i < c.length; ) {
            int neg = c[i] == '-' ? -1 : 1 ;
            int num = 0, den = 0;
            if( c[i] == '+' || c[i] == '-' ) { i++; }
            while( i < c.length && c[i] != '/' ) {
                num = num*10 + (c[i++] - '0');
            }
            i++;
            while( i < c.length && c[i] != '+' && c[i] != '-' ) {
                den = den*10 + (c[i++] - '0');
            }
            l.add( den );
            l.add( neg * num );
            lcm = getLCM( lcm, (long)den );
        }
        long sum = 0;
        while( l.size() > 0 ) {
            long den = (long)l.remove(0), num = (long)l.remove(0);
            sum += num * (lcm / den);
        }
        long gcd = getGCD( lcm, Math.abs(sum) );
        return sum / gcd + "/" + lcm / gcd;
    }

    private long getLCM(long a, long b) {
        return a*b / getGCD( a, b );
    }

    private long getGCD(long a, long b) {
        if( b > a ) { a ^= b; b ^= a; a ^= b; }
        if( b == 0 ) { return a; }
        while( a % b != 0 ) {
            long c = b;
            b = a % b;
            a = c;
        }
        return b;
    }
}