class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length, k = n;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < k - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
            k = k - 1;
        }
    }
}