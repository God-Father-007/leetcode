class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s =new Stack<>();
        for( int rock : asteroids ) {
            boolean bigger = true;
            while( s.size() > 0 && s.peek() > 0 && rock < 0 ) {
                int l = Math.abs(rock), r = Math.abs( s.peek() );
                if ( l >= r ) { s.pop(); }
                if ( l <= r ) { bigger = false; break; }
            }
            if( bigger ) { s.push(rock); }
        }
        int[] ans = new int[s.size()];
        int i = ans.length;
        while( s.size() > 0 ) { ans[--i] = s.pop(); }
        return ans;
    }
}