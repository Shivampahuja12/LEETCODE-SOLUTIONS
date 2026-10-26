class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int size = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < n) {
            char ch = s.charAt(r);
            if (map.containsKey(ch)) {
                l = Math.max(l, map.get(ch) + 1);
            }
            map.put(ch, r);
            size = Math.max(size, r - l + 1);
            r++;
        }
        return size;
    }
}