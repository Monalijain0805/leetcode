class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Edge case: if matrix is empty
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;        // number of rows
        int n = matrix[0].length;     // number of columns

        // Start from top-right corner
        int row = 0;
        int col = n - 1;

        // Traverse while inside matrix boundaries
        while (row < m && col >= 0) {

            // If target is found
            if (matrix[row][col] == target) {
                return true;
            }

            // If current element is greater than target
            // move left (because left side elements are smaller)
            else if (matrix[row][col] > target) {
                col--;
            }

            // If current element is smaller than target
            // move down (because below elements are larger)
            else {
                row++;
            }
        }

        // Target not found
        return false;
    }
}