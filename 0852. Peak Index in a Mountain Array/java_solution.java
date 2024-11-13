class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0, j = arr.length-1;
        while(i < j) {
            int m = (i+j)/2;
            if( arr[m-1] < arr[m] && arr[m] > arr[m+1] ) { return m; }
            if( arr[m-1] < arr[m] && arr[m] < arr[m+1] ) { i = m; }
            else { j = m; }
        }
        return -1;
    }
}