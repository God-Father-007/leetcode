class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        text = " " + text + " ";
        String s = " " + first + " " + second + " ";
        int i = text.indexOf(s), l = s.length();
        ArrayList<String> list = new ArrayList<>();
        while( i >= 0 ) {
            int q = i+l, p = q;
            while( q < text.length() && text.charAt(q) != ' ' ) { q++; }
            if( p < q ) { list.add( text.substring(p,q) ); }
            i = text.indexOf(s,i+1);
        }
        String[] ans = new String[list.size()];
        for( i=0;i<list.size();i++ ) { ans[i] = list.get(i); }
        return ans;
    }
}