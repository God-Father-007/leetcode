class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> s = new HashSet<>();
        for( String email : emails ) {
            String[] parts = email.split("@");
            s.add(parts[0].split("\\+")[0].replaceAll("\\.","") + "@" + parts[1]);
        }
        return s.size();
    }
}