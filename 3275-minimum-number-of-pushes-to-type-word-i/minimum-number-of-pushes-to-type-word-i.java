class Solution {
    public int minimumPushes(String word) {
        int totalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (i < 8) {
                totalCount += 1;
                System.out.println(i + " " + word.charAt(i) + " " + totalCount);

            }
            else if (i < 16) {
                totalCount += 2;
                System.out.println(i + " " + word.charAt(i) + " " + totalCount);

            }
            else if (i < 24) {
                totalCount += 3;
                System.out.println(i + " " + word.charAt(i) + " " + totalCount);

            }
            else {
                totalCount += 4;
                System.out.println(i + " " + word.charAt(i) + " " + totalCount);

            }
        }
        return totalCount;
    }
}