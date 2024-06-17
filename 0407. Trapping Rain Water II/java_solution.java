class Solution {
    
    public class Pair implements Comparable<Pair> {
        int r,c,h;
        
        Pair( int r, int c, int h ) {
            this.r = r;
            this.c = c;
            this.h = h;
        }
        @Override
        public int compareTo( Pair o ) {
            return this.h - o.h;
        }
    }
    
    public int trapRainWater(int[][] height) {
        int m = height.length, n = height[0].length;
        PriorityQueue<Pair> q = new PriorityQueue<>();
        boolean[][] v = new boolean[m][n];
        for( int j=0;j<n;j++ ) {
            q.add( new Pair( 0,j,height[0][j] ) );
            v[0][j] = true;
            q.add( new Pair( m-1,j,height[m-1][j] ) );
            v[m-1][j] = true;
        }
        for( int i=1;i<m-1;i++ ) {
            q.add( new Pair( i,0,height[i][0] ) );
            v[i][0] = true;
            q.add( new Pair( i,n-1,height[i][n-1] ) );
            v[i][n-1] = true;
        }
        int[][] drxn = { {-1,0}, {0,1}, {1,0}, {0,-1} };
        int water = 0;
        while( q.size() > 0 ) {
            Pair p = q.remove();
            for( int[] d : drxn ) {
                int r = p.r + d[0], c = p.c + d[1];
                if( r < 0 || c < 0 || r == m || c == n || v[r][c] ) { continue; }
                v[r][c] = true;
                if( height[r][c] < p.h ) {
                    water += p.h - height[r][c];
                    q.add( new Pair( r, c, p.h ) );
                } else {
                    q.add( new Pair( r, c, height[r][c] ) );
                }
            }
        }
        return water;
    }
}