class Solution {
    public int reverse(int x) {
        if(x > -10 && x < 10) {return x;}
        Long l = (long)x;
        while(l%10 == 0) {l /= 10;}
        boolean f = false;
        if(l < 0) {f = true;}
        l = Math.abs(l);
        String s = "";
        while(l > 0) {
            s += l%10 + "";
            l /= 10;
        }
        l = Long.parseLong(s);
        if(f) {l = 0-l;}
        if(l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {return 0;}
        x = l.intValue();
        return x;
    }
}