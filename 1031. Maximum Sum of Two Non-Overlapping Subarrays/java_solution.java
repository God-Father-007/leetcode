class Solution {
    
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;
        int[] ff = new int[n], bf = new int[n], fs = new int[n], bs = new int[n];
        int sum = 0 ;
        for( int i=0;i<firstLen;i++ ) { sum += nums[i]; }
        ff[firstLen-1] = sum;
        for( int i=firstLen;i<n;i++ ) {
            sum += nums[i] - nums[i-firstLen];
            ff[i] = Math.max( ff[i-1],sum );
        }
        sum = 0;
        for( int i=n-1;i>n-firstLen-1;i-- ) { sum += nums[i]; }
        bf[n-firstLen] = sum;
        for( int i=n-firstLen-1;i>=0;i-- ) {
            sum += nums[i] - nums[i+firstLen];
            bf[i] = Math.max( bf[i+1],sum );
        }
        sum = 0;
        for( int i=0;i<secondLen;i++ ) { sum += nums[i]; }
        fs[secondLen-1] = sum;
        for( int i=secondLen;i<n;i++ ) {
            sum += nums[i] - nums[i-secondLen];
            fs[i] = Math.max( fs[i-1],sum );
        }
        sum = 0;
        for( int i=n-1;i>n-secondLen-1;i-- ) { sum += nums[i]; }
        bs[n-secondLen] = sum;
        for( int i=n-secondLen-1;i>=0;i-- ) {
            sum += nums[i] - nums[i+secondLen];
            bs[i] = Math.max( bs[i+1],sum );
        }
        int ans = Integer.MIN_VALUE;
        for( int i=firstLen-1;i<n-secondLen;i++ ) { ans = Math.max( ans,ff[i]+bs[i+1] ); }
        for( int i=secondLen-1;i<n-firstLen;i++ ) { ans = Math.max( ans,fs[i]+bf[i+1] ); }
        return ans;
    }
}