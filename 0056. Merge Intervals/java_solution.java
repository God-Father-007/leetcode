class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> al = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> (a[0] - b[0]));
        int min = intervals[0][0], max = intervals[0][1];
        for(int i=1;i<intervals.length;i++) {
            if( intervals[i][0] <= max ) {
                max = Math.max(max,intervals[i][1]);
            } else {
                int[] temp = { min, max };
                al.add(temp);
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        int[] temp = { min, max };
        al.add(temp);
        int[][] ans = new int[al.size()][2];
        for( int i=0;i<ans.length;i++ ) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}