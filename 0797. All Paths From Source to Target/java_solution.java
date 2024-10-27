class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans = new ArrayList<>();
        helper( graph, 0, new ArrayList<>() );
        return ans;
    }

    private void helper( int[][] g, int s, List<Integer> path ) {
        path.add( s );
        if( s == g.length - 1 ) {
            List<Integer> l = new ArrayList<>();
            l.addAll( path );
            path.remove( path.size() - 1 );
            ans.add( l );
            return;
        }
        for( int i = 0; i < g[s].length; i++ ) {
            helper( g, g[s][i], path );
        }
        path.remove( path.size() - 1 );
    }
}