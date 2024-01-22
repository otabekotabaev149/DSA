import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int[] i : mat){
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
        // Rotate Matrix
        new RotateMatrix().rotate(mat);
        for(int[] i : mat){
            System.out.println(Arrays.toString(i));
        }
    }

    private void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] mat = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                mat[i][j] = matrix[i][j];
            }
        }
        int l = len-1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                matrix[j][l] = mat[i][j];
            }
            l--;
        }
    }
}
