class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a')
                a++;
            else
                b++;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'b' && a != 0) {
                return false;
            }
            if (s.charAt(i) == 'b' && a == 0) {
                return true;
            }

            if (s.charAt(i) == 'a')
                a--;
            else
                b--;
        }
        return true;
    }
}