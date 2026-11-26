class Solution {
    /* 
        trick is to find the pattern of finding the second string
        which we will get from reversing the given string
        then find -> LCS(longest common subsequence);    
    */
    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int[][] t = new int[n + 1][n + 1];
        for (int[] arr : t) {
            Arrays.fill(arr, -1);
        }
        return lcs(s, s2, n, n, t);
    }

    public int lcs(String s1, String s2, int n, int m, int[][] t) {

        if (n == 0 || m == 0)
            return 0;

        if (t[n][m] != -1)
            return t[n][m];

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return t[n][m] = 1 + lcs(s1, s2, n - 1, m - 1, t);
        } else {
            return t[n][m] = Math.max(lcs(s1, s2, n - 1, m, t), lcs(s1, s2, n, m - 1, t));
        }
    }
}