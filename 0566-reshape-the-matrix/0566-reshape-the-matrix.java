class Solution {
   public static int[][] matrixReshape(int[][] mat, int r, int c) {

        if(mat.length * mat[0].length != r * c) return mat;

        int res[][] = new int[r][c];

        int row = 0, col = 0;

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                res[row][col] = mat[i][j];
                col++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }

        return res;
    }
}