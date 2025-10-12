class Solution {
    public void rotate(int[][] matrix) {
        int[][] res = transpose(matrix);

        int[][] main = rotateMat(res);

        // matrix = main;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j] = main[i][j];
            }
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
        }

        return res;
    }

    static int[][] rotateMat(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int c = 0;
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                res[i][j] = matrix[i][c++];
            }
        }

        return res;
    }
}