class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0;
        for (int i : cardPoints) {
            total += i;
        }
        int n = cardPoints.length;
        int windowSize = n - k;
        int windowSum = 0;
        int minWindowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        minWindowSum = windowSum;

        // Slide the window
        for (int i = windowSize; i < n; i++) {
            windowSum = windowSum - cardPoints[i - windowSize] + cardPoints[i];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return total - minWindowSum;
    }
}