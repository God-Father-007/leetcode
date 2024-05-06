class Solution {
    public String numberToWords(int num) {
        if( num == 0 ) { return "Zero"; }
        String[] place = new String[]{""," Thousand"," Million"," Billion"};
        StringBuilder ans = new StringBuilder();
        for(int i=0; num > 0;i++ ) {
            int part = num % 1000;
            if( part > 0 )
                ans.insert( 0, spellPart( part ) + place[i] );
            num /= 1000;
        }
        return ans.substring(1);
    }
    private String spellPart(int n) {
        StringBuilder ans = new StringBuilder();
        int h = n / 100;
        if( h > 0 ) { ans.append( helper(h,true) + " Hundred" ); }
        n %= 100;
        if( n > 9 && n < 20 ) {
            ans.append( handleTeens(n) );
        } else {
            ans.append( helper(n/10,false) );
            ans.append( helper(n%10, true) );
        }
        return ans.toString();
    }

    private String handleTeens(int n) {
        switch(n) {
            case 11:
                return " Eleven";
            case 12:
                return " Twelve";
            case 13:
                return " Thirteen";
            case 14:
                return " Fourteen";
            case 15:
                return " Fifteen";
            case 16:
                return " Sixteen";
            case 17:
                return " Seventeen";
            case 18:
                return " Eighteen";
            case 19:
                return " Nineteen";
        }
        return " Ten";
    }
    private String helper(int n, boolean ones) {
        switch(n) {
            case 1:
                return " One";
            case 2:
                return ones ? " Two" : " Twenty";
            case 3:
                return ones ? " Three" : " Thirty";
            case 4:
                return ones ? " Four" : " Forty";
            case 5:
                return ones ? " Five" : " Fifty";
            case 6:
                return ones ? " Six" : " Sixty";
            case 7:
                return ones ? " Seven" : " Seventy";
            case 8:
                return ones ? " Eight" : " Eighty";
            case 9:
                return ones ? " Nine" : " Ninety";
        }
        return "";
    }

}