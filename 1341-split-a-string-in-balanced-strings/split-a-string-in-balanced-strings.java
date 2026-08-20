class Solution {
    public int balancedStringSplit(String s) {
        int lc = 0;
        int rc = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L')
                lc++;
            if (s.charAt(i) == 'R')
                rc++;
            if (lc == rc) {
                count++;
                lc = 0;
                rc = 0;
            }
        }
        return count;
    }
}