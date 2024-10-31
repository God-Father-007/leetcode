class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> h = new HashMap<>();
        for( String cpd : cpdomains ) {
            String[] comp = cpd.split(" ");
            int count = Integer.parseInt( comp[0] );
            comp = comp[1].split("\\.");
            String key = "";
            for( int i=comp.length-1;i>=0;i-- ) {
                if( i < comp.length-1 ) { key = "."+key; }
                key = comp[i] + key;
                if( h.containsKey(key) ) { h.put( key, h.get(key)+count ); }
                else { h.put( key, count ); }
            }
        }
        List<String> ans = new ArrayList<>();
        for( String key : h.keySet() ) {
            ans.add(h.get(key) + " " + key);
        }
        return ans;
    }
}