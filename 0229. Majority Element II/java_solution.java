class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int v1 = arr[0], v2= Integer.MAX_VALUE, c1 = 1, c2 = 0;
        for( int i=1;i<arr.length;i++ ) {
            if( v1 == arr[i] ) { c1++; }
            else if( v2 == arr[i] ) { c2++; }
            else {
                if( c1 == 0 ) { v1 = arr[i]; c1 = 1; }
                else if( c2 == 0 ) { v2 = arr[i]; c2 = 1; }
                else { c1--; c2--; }
            }
        }
        int f1 = 0, f2= 0;
        for( int v : arr ) { f1 += v == v1 ? 1 : 0 ; f2 += v == v2 ? 1 : 0 ; }
        if( f1 > arr.length/3 ) { ans.add(v1); }
        if( f2 > arr.length/3 ) { ans.add(v2); }
        return ans;
    }
}