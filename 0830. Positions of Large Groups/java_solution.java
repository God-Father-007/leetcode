class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int i=0, j=1;
        while( j < s.length() ) {
            while( j < s.length() && s.charAt(i) == s.charAt(j) ) { j++; }
            if( j-i >= 3 ) {
                List<Integer> a = new ArrayList<>();
                a.add(i);
                a.add(j-1);
                ans.add(a);
            }
            i=j;
            j++;
        }
        return ans;
    }
}