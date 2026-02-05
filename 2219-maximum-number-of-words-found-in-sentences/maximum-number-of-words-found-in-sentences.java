class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i=0; i<sentences.length; i++){
            int length = findLength(sentences[i]);
            if (length > max) max = length;
        }
        return max;
    }
    public int findLength(String s){
        String[] words = s.split(" ");
        return words.length;
    }
}