class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int startCol = 0;
        int endCol = mat[0].length - 1;
        
        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            
            // Find the row with the maximum element in the current middle column
            int maxRow = 0;
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }
            
            // Check if the left or right neighbor is strictly greater
            boolean leftIsBigger = midCol - 1 >= startCol && mat[maxRow][midCol - 1] > mat[maxRow][midCol];
            boolean rightIsBigger = midCol + 1 <= endCol && mat[maxRow][midCol + 1] > mat[maxRow][midCol];
            
            // If neither neighbor is strictly greater, it's a peak
            if (!leftIsBigger && !rightIsBigger) {
                return new int[]{maxRow, midCol};
            } 
            // If the right element is greater, a peak must exist in the right half
            else if (rightIsBigger) {
                startCol = midCol + 1;
            } 
            // Otherwise, a peak must exist in the left half
            else {
                endCol = midCol - 1;
            }
        }
        
        return new int[]{-1, -1}; // Fallback (should not be reached based on problem constraints)
    }
}