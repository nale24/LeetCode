class Solution {
    public void rotate(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        
        transpose(matrix);
        flip(matrix);
        
    }
    
    private void transpose(int[][] matrix) {
        int size = matrix.length;
        
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    } //transpose
    
    private void flip(int[][] matrix) {
        int size = matrix.length;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size - 1 - j];
                matrix[i][size - 1 - j] = temp;
            }
        }
    }
}