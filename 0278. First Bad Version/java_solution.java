/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int l = 2, r = n;
            while( l <= r ) {
                int m = l + (r-l)/2 ;
                if( isBadVersion(m) ) {
                    if( isBadVersion(m-1) ) { r = m-1; continue; }
                    return m;
                } else {
                    l = m+1;
                }
            }
            return 1;
        }
    }