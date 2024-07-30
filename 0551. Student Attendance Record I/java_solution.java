class Solution {
    public boolean checkRecord(String s) {
        String t = s.replaceAll("A","");
        if( s.length() > t.length() + 1 ) { return false; }
        t = s.replaceAll("LLL","");
        if( s.length() != t.length() ) { return false; }
        return true;
    }
}