/**
 * runs in O(m+n) time
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int i=0, j=0, max = Integer.MIN_VALUE;
        for( int x=0; x<=(m+n)/2; x++ ) {
            int a = i < m ? nums1[i] : Integer.MAX_VALUE;
            int b = j < n ? nums2[j] : Integer.MAX_VALUE;
            if( x == (m+n)/2 ) {
                if( (m+n)%2 == 1 ) { return 1.0*Math.min(a,b); }
                return 1.0*(max + Math.min(a,b)) / 2;
            }
            if( a < b ) { max = a; i++; } else { max = b; j++; }
        }
        return 0.0;
    }
}