class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort( expected );
        int count = 0;
        for( int i=0;i<heights.length;i++ ) {
            count += heights[i] == expected[i] ? 0 : 1;
        }
        return count;
    }
}