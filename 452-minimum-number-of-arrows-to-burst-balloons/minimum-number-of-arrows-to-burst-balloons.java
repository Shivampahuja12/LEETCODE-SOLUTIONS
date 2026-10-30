class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int endPos = points[0][1];
        for (int i = 1; i < n; i++) {
            if (points[i][0] > endPos) {
                arrows++;
                endPos = points[i][1];
            }
        }
        return arrows;

    }
}