class Solution {
    public int minimumPushes(String word) {
        int totalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (i < 8) totalCount += 1;
            else if (i < 16) totalCount += 2;
            else if (i < 24) totalCount += 3;
            else totalCount += 4;
        }
        return totalCount;
    }
}