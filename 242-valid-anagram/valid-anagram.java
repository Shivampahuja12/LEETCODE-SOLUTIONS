class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i=0; i<t.length(); i++){
            mp2.put(t.charAt(i), mp2.getOrDefault(t.charAt(i), 0) + 1);
        }
 
        Set<Character> key1 = mp1.keySet();
        Set<Character> key2 = mp2.keySet();

        for (Character key: key1){
            if (!mp1.get(key).equals(mp2.get(key))){
                return false;
            }
        }
        return true;
    }
}