class Solution {
    
    public List<String> func(int t, int l) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<l;i++) {
            if( Integer.bitCount(i) == t ) {
                if( l==60 && i<10 ) { ans.add( "0"+i ); }
                else { ans.add( i+"" ); }
            }
        }
        return ans;
    }
    
    public List<String> readBinaryWatch(int num) {
        List<String> ans = new ArrayList<>();
        if( num > 8 ) { return ans; }
        for( int i=0;i<4&&i<=num;i++ ) {
            if( num-i < 6 ) {
                List<String> hours = func(i,12);
                List<String> mins = func(num-i,60);
                for( String s1 : hours ) {
                    for( String s2 : mins ) { ans.add( s1+":"+s2 ); }
                }
            }
        }
        return ans;
    }
}