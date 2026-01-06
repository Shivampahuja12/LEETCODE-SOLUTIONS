class Solution {
    public int numberOfSpecialChars(String word) {
        // StringBuilder sb = new StringBuilder(word);
        StringBuilder result = new StringBuilder();
        for (int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            String s = String.valueOf(ch);
            if (result.toString().contains(s)){
                continue;
            }
            else {
                result.append(word.charAt(i));
            }
        }

        int count = 0;
        for (int i = 0; i < result.length(); i++) {
            for (int j = i + 1; j < result.length(); j++) {
                if (result.charAt(i) - result.charAt(j) == 32 || result.charAt(j) - result.charAt(i) == 32) {
                    result.setCharAt(i, '0');
                    result.setCharAt(j, '0');
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}