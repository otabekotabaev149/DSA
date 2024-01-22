public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        setZeroes(matrix);
    }

    private static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] mat = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    int k = j+1;
                    while(k<cols){
                        if(matrix[i][k] != 0){
                            mat[i][k] = -1;
                        }
                        else {
                            mat[i][k] = 0;
                        }
                        k++;
                    }
                    k = j-1;
                    while(k>=0){
                        if(matrix[i][k] != 0) {
                            mat[i][k] = -1;
                        }
                        else {
                            mat[i][k] = 0;
                        }
                        k--;
                    }
                    k = i+1;
                    while(k<rows){
                        if(matrix[k][j] != 0) {
                            mat[k][j] = -1;
                        }
                        else {
                            mat[k][j] = 0;
                        }
                        k++;
                    }
                    k = i-1;
                    while(k>=0){
                        if(matrix[k][j] != 0) {
                            mat[k][j] = -1;
                        }
                        else {
                            mat[k][j] = 0;
                        }
                        k--;
                    }
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j] == -1){
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
