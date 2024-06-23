class Solution {
    public String originalDigits(String s) {
        char[] c = s.toCharArray();
        int[] x = new int[10];
        Map<Character,Integer> m = new HashMap<>();
        for( char a : c ) { m.put( a, m.getOrDefault(a,0) + 1 ); }
        x[0] = getFreq( m, 'z', "zero".toCharArray() );
        x[2] = getFreq( m, 'w', "two".toCharArray() );
        x[4] = getFreq( m, 'u', "four".toCharArray() );
        x[6] = getFreq( m, 'x', "six".toCharArray() );
        x[8] = getFreq( m, 'g', "eight".toCharArray() );
        x[1] = getFreq( m, 'o', "one".toCharArray() );
        x[3] = getFreq( m, 'h', "thre".toCharArray() );
        x[5] = getFreq( m, 'f', "five".toCharArray() );
        x[7] = getFreq( m, 'v', "seven".toCharArray() );
        x[9] = getFreq( m, 'i', "nine".toCharArray() );
        StringBuilder ans = new StringBuilder();
        for( int i=0; i<x.length; i++ ) {
            ans.append((i+"").repeat(x[i]));
        }
        return ans.toString();
    }

    private int getFreq( Map<Character,Integer> m, char id, char[] chars ) {
        if( !m.containsKey(id) ) { return 0; }
        int t = m.get(id);
        m.remove(id);
        for( char c : chars ) {
            m.put( c, m.getOrDefault(c,0)-t );
            if( m.get(c) <= 0 ) { m.remove(c); }
        }
        return t;
    }
}