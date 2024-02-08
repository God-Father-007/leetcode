class Solution {
    
    private String getRoman( int val, int place, HashMap<Integer,String> h ) {
        String s = h.get(place);
        String o = s.charAt(0)+"", f = s.charAt(1)+"", t = s.charAt(2)+"";
        String ans = "";
        switch(val) {
            case 0:
                break;
            case 1:
                ans = o;
                break;
            case 2:
                ans = o+o;
                break;
            case 3:
                ans = o+o+o;
                break;
            case 4:
                ans = o+f;
                break;
            case 5:
                ans = f;
                break;
            case 6:
                ans = f+o;
                break;
            case 7:
                ans = f+o+o;
                break;
            case 8:
                ans = f+o+o+o;
                break;
            case 9:
                ans = o+t;
                break;
        }
        return ans;
    }
    
    public String intToRoman(int num) {
        HashMap<Integer,String> h = new HashMap<>();
        h.put(1,"IVX");
        h.put(10,"XLC");
        h.put(100,"CDM");
        h.put(1000,"M  ");
        String ans = "";
        int place = 1000;
        while( place > 0 ) {
            ans += getRoman( num/place, place, h );
            num %= place;
            place /= 10;
            
        }
        return ans;
    }
}