class Solution {
    public int longestPalindrome(String s) {

        if (s.length() == 1)
            return 1;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0;
        boolean flag = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0){
                count += (entry.getValue() / 2) * 2;
                flag = true;
            }
            else {
                count += entry.getValue();
            }
        }
        
        if (flag) return count + 1;
        else return count;

    }
}