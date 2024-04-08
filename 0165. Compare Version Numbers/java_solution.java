class Solution {
    public int compareVersion(String version1, String version2) {
        while( version1.length() > 0 || version2.length() > 0 ) {
            int i=0;
            while( i < version1.length() && version1.charAt(i) != '.' ) { i++; }
            int n1 = 0;
            if( version1.length() != 0 ) { n1 = Integer.parseInt( version1.substring(0,i) ); }
            if( i == version1.length() ) { version1 = version1.substring(i); }
            else { version1 = version1.substring(i+1); }
            i = 0;
            while( i < version2.length() && version2.charAt(i) != '.' ) { i++; }
            int n2 = 0;
            if( version2.length() != 0 ) { n2 = Integer.parseInt( version2.substring(0,i) ); }
            if( i == version2.length() ) { version2 = version2.substring(i); }
            else { version2 = version2.substring(i+1); }
            if( n1 < n2 ) { return -1; }
            else if( n1 > n2 ) { return 1; }
        }
        return 0;
    }
}