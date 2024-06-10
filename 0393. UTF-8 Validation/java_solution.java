class Solution {
    public boolean validUtf8(int[] arr) {
        for( int i=0;i<arr.length;i++ ) {
            if( arr[i]>>7 == 0 ) { continue; }
            if( arr[i] == 255 || arr[i]>>6 == 2 ) { return false; }
            for( int b=4;b>1;b-- ) {
                if( arr[i]>>(8-b-1) == ((1<<b)-1)<<1 ) {
                    if( i+b-1 >= arr.length ) { return false; }
                    for( int x=1;x<b;x++ ) {
                        if( arr[i+x]>>6 != 2 ) { return false; }
                    }
                    i += b-1;
                    break;
                }
            }
        }
        return true;
    }
}