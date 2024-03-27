class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        StringBuilder a = new StringBuilder();
        a.append(s);
        a.reverse();
        if( s.equals(a.toString()) ) {return true;}
        return false;
    }
}