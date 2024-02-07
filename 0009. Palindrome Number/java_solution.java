class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {return false;}
        else if (x >= 0 && x < 10) {return true;}
        Long l = new Long(0);
        int temp = x; 
        long size = 1;
        while(temp > 0) {
            size *= 10;
            temp /= 10;
        }
        size /= 10;
        temp = x;
        while(temp > 0) {
            l += (long)(temp%10)*size;
            size /= 10;
            temp /= 10;
        }
        if(l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {return false;}
        temp = l.intValue();
        if(x == temp) {return true;} else {return false;}
    }
}