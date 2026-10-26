class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int size = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < n) {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.get(ch) > 1) {
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            size = Math.max(size, r - l + 1);
            r++;
        }
        return size;
    }
}