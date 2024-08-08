class Solution {
    public int distributeCandies(int[] candies) {
        HashMap<Integer,Integer> f = new HashMap<>();
        for( int e : candies ) {
            if( !f.containsKey(e) ) { f.put(e,1); }
            else { f.put( e, f.get(e)+1 ); }
        }
        if( f.size() >= candies.length/2 ) { return candies.length/2; }
        return f.size();
    }
}