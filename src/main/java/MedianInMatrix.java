public class MedianInMatrix {
    public static void main(String[] args) {

    }

    private static int median(int matrix[][], int n, int m) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m-1]);
        }
        int req = (n*m) / 2;
        while(low <= high){
            int mid = (high + low) / 2;
            int smallEqual = countSmallEqual(matrix, n, m, mid);
            if(smallEqual <= req){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int countSmallEqual(int[][] matrix, int n, int m, int x) {
        int count = 0;
        for(int i=0;i<n;i++){
            count += upperBound(matrix[i], x, m);
        }
        return count;
    }

    private static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
