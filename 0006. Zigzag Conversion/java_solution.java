class Solution {
    public String convert(String s, int numRows) {
        if( s.length() <= numRows || numRows == 1) { return s; }
        String[] a = new String[numRows];
        
        for(int i=0; i<numRows ;i++) {
            a[i] = "";
        }
        a[0] += s.charAt(0);
        int j = 0;
        boolean f = true; // moving forward
        for(int i=1;i<s.length();i++) {
            if(f) {
                j++;
                a[j] += s.charAt(i);
                if(j == a.length - 1) { f = false; }
            } else {
                j--;
                a[j] += s.charAt(i);
                if( j == 0 ) { f = true; }
            }
        }
        
        for(int i=1; i<numRows ;i++) {
            a[0] += a[i];
        }
        
        return a[0];
        
    }
}