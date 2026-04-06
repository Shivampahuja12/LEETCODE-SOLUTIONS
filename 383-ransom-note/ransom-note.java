class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            m1.put(ransomNote.charAt(i), m1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            m2.put(magazine.charAt(i), m2.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: m1.entrySet()){
            char ch = entry.getKey();
            int fneed = entry.getValue();
            Integer fhave = m2.getOrDefault(ch, 0);
            if (fneed > fhave){
                return false;
            }
        }

        return true;
    }
}