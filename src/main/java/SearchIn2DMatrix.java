public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1}};
        System.out.println(search(mat, 1));;
    }

    private static boolean search(int[][] mat, int t) {
        int rows = mat.length;
        if(rows == 1){
            return binarySearch(mat[rows-1], t);
        }
        int row=-1, last = mat[0].length-1;
        for(int i=0;i<rows;i++){
            if(t >= mat[i][0] && t <= mat[i][last]){
                row = i;
                break;
            }
        }
        if(row == -1){
            return false;
        }
        return binarySearch(mat[row], t);

    }
    public static boolean binarySearch(int[] arr, int t){
        int low = 0;
        int high = arr.length-1;
        if(high == 0 && arr[high] == t){
            return true;
        }
        if(high == 0 && arr[high] != t){
            return false;
        }
        while(high - low > 1){
            int mid = (low + high) / 2;
            if(arr[mid] < t){
                low = mid+1;
            }
            else {
                high = mid;
            }
        }
        if(arr[low] == t || arr[high] == t){
            return true;
        }else {
            return false;
        }
    }
}
