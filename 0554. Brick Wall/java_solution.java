class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int ans = wall.size();
        Map<Long,Integer> m = new HashMap<>();
        for( List<Integer> row : wall ) {
            long sum = 0;
            for( int i = 0; i < row.size()-1; i++ ) {
                sum += row.get(i);
                m.put( sum, m.getOrDefault(sum, wall.size()) - 1 );
                ans = Math.min( ans, m.get(sum) );
            }
        }
        return ans;
    }
}