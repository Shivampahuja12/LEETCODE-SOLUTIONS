class Solution {
    public int balancedStringSplit(String s) {
        int x = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') x++;
            else x--;
            if (x == 0) count++;   
        }
        return count;
    }
}