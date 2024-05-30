class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for( int v : nums1 ) { s1.add(v); }
        for( int v : nums2 ) {
            if( s1.contains(v) ) {s2.add(v);}
        }
        int[] ans = new int[s2.size()];
        int i=0;
        for( Integer val : s2 ) { ans[i] = val; i++; }
        return ans;
    }
}