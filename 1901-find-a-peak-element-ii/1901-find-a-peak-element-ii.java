class Solution {

    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int midCol = (low + high) / 2;

            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            int left = (midCol - 1 >= 0) ? mat[maxRow][midCol - 1] : -1;
            int right = (midCol + 1 < cols) ? mat[maxRow][midCol + 1] : -1;
            int current = mat[maxRow][midCol];

            if (current > left && current > right) {
                return new int[]{maxRow, midCol};
            }

            else if (right > current) {
                low = midCol + 1;
            } 
            else {
                high = midCol - 1;
            }
        }

        return new int[]{-1, -1};
    }
}