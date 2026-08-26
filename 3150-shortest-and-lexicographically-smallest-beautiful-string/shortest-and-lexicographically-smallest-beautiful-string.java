class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        // int right = 0;
        int count = 0;
        int length = s.length();
        ArrayList<String> subs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1') {
                count++;
            }

            while (count == k) {

                String current = s.substring(left, right + 1);

                if (sb.length() == 0 ||
                        current.length() < sb.length() ||
                        (current.length() == sb.length() && current.compareTo(sb.toString()) < 0)) {
                    sb = new StringBuilder(current);
                }

                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
        }
        return sb.toString();
    }
}