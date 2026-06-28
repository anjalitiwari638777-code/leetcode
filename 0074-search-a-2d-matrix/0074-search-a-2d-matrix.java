class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int colm = matrix[0].length;

        int low = 0;
        int high = rows * colm - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / colm;
            int col = mid % colm;

            int val = matrix[row][col];

            if (val == target) {
                return true;
            } 
            else if (val < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return false;
    }
}