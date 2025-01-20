class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String a = "", b = "";
        if( str1.length() < str2.length() ) { a = str1; b = str2; }
        else { a = str2; b = str1; }
        String div = "", ans = "";
        for( int i=0;i<a.length();i++ ) {
            div += a.charAt(i);
            if( a.replaceAll(div,"").equals("") && b.replaceAll(div,"").equals("") ) { ans = div; }
        }
        return ans;
    }
}