class Solution {
    public int minimumPushes(String word) {
        int totalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            totalCount += (i/8) + 1;
        }
        return totalCount;
    }
}