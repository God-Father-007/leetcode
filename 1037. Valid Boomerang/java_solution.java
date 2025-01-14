class Solution {
    public boolean isBoomerang(int[][] points) {
        double s1 = 0.0, s2 = 0.0, s3 = 0.0;
        double num = Math.abs(points[0][1] - points[1][1]);
        double den = Math.abs(points[0][0] - points[1][0]);
        if( den == 0 ) { if( num == 0 ) { return false; } s1 = 90; } else { s1 = num / den; }
        num = Math.abs(points[0][1] - points[2][1]);
        den = Math.abs(points[0][0] - points[2][0]);
        if( den == 0 ) { if( num == 0 ) { return false; } s2 = 90; } else { s2 = num / den; }
        num = Math.abs(points[1][1] - points[2][1]);
        den = Math.abs(points[1][0] - points[2][0]);
        if( den == 0 ) { if( num == 0 ) { return false; } s3 = 90; } else { s3 = num / den; }
        return !(s1 == s2 && s2 == s3);
    }
}