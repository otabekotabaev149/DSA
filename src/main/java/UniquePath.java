public class UniquePath {
    public static void main(String[] args) {

    }

    private static int countPaths(int i, int j, int n, int m, int[][] matrix){
        if(i == (n-1) && j == (m-1)) return 1;
        if(i >= n || j >= m) return 0;

        if(matrix[i][j] != -1) return matrix[i][j];

        matrix[i][j] = countPaths(i+1, j, n, m, matrix) + countPaths(i, j+1, n, m, matrix);
        return matrix[i][j];
    }

    private int uniquePaths2(int m, int n) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        return countPaths(0, 0, n, m, matrix);
    }

    private int uniquePaths(int m, int n) {
        int N = n + m - 2;
        int r = m - 1;
        double res = 1;

        for(int i=1;i<=r;i++){
            res = res * (N - r + i) / i;
        }

        return (int)res;
    }
}
