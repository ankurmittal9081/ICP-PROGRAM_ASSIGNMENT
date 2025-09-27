// Last updated: 9/27/2025, 9:19:31 PM

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int r = matrix.length;
        int c = matrix[0].length;
        int total = 0; 
        int left = 0; 
        int right = c - 1;
        int top = 0; 
        int bottom = r - 1; 

        while (total < r * c) {
            for (int i = left; i <= right && total < r * c; i++) {
                result.add(matrix[top][i]);
                total++;
            }
            top++;

            for (int j = top; j <= bottom && total < r * c; j++) {
                result.add(matrix[j][right]);
                total++;
            }
            right--; 
                
            for (int i = right; i >= left && total < r * c; i--) {
                result.add(matrix[bottom][i]);
                total++;
            }
            bottom--; 
            for (int j = bottom; j >= top && total < r * c; j--) {
                result.add(matrix[j][left]);
                total++;
            }
            left++; 
        }

        return result;
    }
}
