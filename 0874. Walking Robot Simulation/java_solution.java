class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0, d = 0, ans = 0;
        Map<Integer,List<Integer>> h = new HashMap<>();
        Map<Integer,List<Integer>> v = new HashMap<>();
        for( int[] o : obstacles ) {
            if( !h.containsKey(o[1]) ) {
                h.put( o[1], new ArrayList<>() );
            }
            h.get( o[1] ).add( o[0] );
            if( !v.containsKey(o[0]) ) {
                v.put( o[0], new ArrayList<>() );
            }
            v.get( o[0] ).add( o[1] );
        }
        for( int c : commands ) {
            if( c < 0 ) {
                d += c == -2 ? -1 : 1;
                if( d < 0 ) { d += 4; }
                d %= 4;
                continue;
            }
            if( d == 0 ) {
                if( v.containsKey( x ) ) {
                    List<Integer> l = v.get(x);
                    int newY = y+c;
                    boolean found = false;
                    for( int n : l ) {
                        if( n > y && n <= newY ) { found = true; newY = n; }
                    }
                    y = newY - ( found ? 1 : 0 );
                } else {
                    y += c;
                }
            }
            else if( d == 1 ) {
                if( h.containsKey( y ) ) {
                    List<Integer> l = h.get(y);
                    int newX = x+c;
                    boolean found = false;
                    for( int n : l ) {
                        if( n > x && n <= newX ) { found = true; newX = n; }
                    }
                    x = newX - (found ? 1 : 0);
                } else {
                    x += c;
                }
            }
            else if( d == 2 ) {
                if( v.containsKey( x ) ) {
                    List<Integer> l = v.get(x);
                    int newY = y-c;
                    boolean found = false;
                    for( int n : l ) {
                        if( n < y && n >= newY ) { found = true; newY = n; }
                    }
                    y = newY + (found ? 1 : 0);
                } else {
                    y -= c;
                }
            }
            else {
                if( h.containsKey( y ) ) {
                    List<Integer> l = h.get(y);
                    int newX = x-c;
                    boolean found = false;
                    for( int n : l ) {
                        if( n < x && n >= newX ) { found = true; newX = n; }
                    }
                    x = newX + (found ? 1 : 0);
                } else {
                    x -= c;
                }
            }
            ans = Math.max( ans, x*x + y*y );
        }
        return ans;
    }
}