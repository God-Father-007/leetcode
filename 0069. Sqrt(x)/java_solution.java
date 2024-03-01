class Solution {
    public int mySqrt(int number) {
        if( number < 2 ) { return number; }
        double t;

        double squareroot = number / 2;

        do {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        } while ((t - squareroot) != 0);

        return (int)squareroot;
    }
}