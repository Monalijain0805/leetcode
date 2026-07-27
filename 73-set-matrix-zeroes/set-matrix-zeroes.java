class Solution {
    public void setZeroes(int[][] arr) {

        // Number of rows and columns
        int m = arr.length;
        int n = arr[0].length;

        // Check whether first row or first column
        // originally contains any 0
        boolean zerorow = false;
        boolean zerocol = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                zerorow = true;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zerocol = true;
            }
        }

        // Use first row and first column as markers
        // If arr[i][j] is 0, mark its row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0;   // Mark this column
                    arr[i][0] = 0;   // Mark this row
                }
            }
        }

        // Make marked columns zero
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Make marked rows zero
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // If first row originally had a 0,
        // make the whole first row 0
        if (zerorow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // If first column originally had a 0,
        // make the whole first column 0
        if (zerocol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }
}