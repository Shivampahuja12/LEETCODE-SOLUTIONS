class Solution {
    public void reverseString(char[] s) {
        if (s.length == 1) return;
        int lo = 0;
        int hi = s.length-1;
        helper(s, lo, hi);
    }

    static void helper(char[] s, int lo, int hi){
        if (lo >= hi) return;
        char temp = s[lo];
        s[lo] = s[hi];
        s[hi] = temp;
        helper(s, lo+1, hi-1);
    }
}