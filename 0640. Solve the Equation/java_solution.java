class Solution {
    public String solveEquation(String equation) {
        char[] c = equation.toCharArray();
        int coeff = 0, constant = 0, cn = 1, nn = -1;
        for( int i = c.length-1; i >= 0; i-- ) {
            boolean isCoeff = false;
            if( c[i] == 'x' ) { isCoeff = true; i--; }
            int place = 1, num = 0;
            while( i >= 0 && c[i] >= '0' && c[i] <= '9' ) {
                num += place * ( c[i--] - '0' );
                place *= 10;
            }
            if( isCoeff && num == 0 && place == 1 ) { num = 1; }
            if( i >= 0 && c[i] == '-' ) { num *= -1; }
            if( isCoeff ) {
                coeff += cn * num;
            } else { constant += nn * num; }
            if( i >= 0 && c[i] == '=' ) { cn = -1; nn = 1; }
        }
        if( coeff == 0 ) {
            return constant == 0 ? "Infinite solutions" : "No solution" ;
        }
        return "x=" + ( constant / coeff );
    }
}