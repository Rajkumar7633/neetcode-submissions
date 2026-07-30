class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i =0;i<matrix.length;i++){
        //     for(int j =0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target) return true;
        //     }
        // }
        // return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left =0;
        int right = rows * cols -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return false;
    }
}
