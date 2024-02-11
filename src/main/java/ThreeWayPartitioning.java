public class ThreeWayPartitioning {
    public static void main(String[] args) {

    }

    public static void threeWayPartition(int arr[], int a, int b) {
        int len = arr.length;
        int left = 0, right = len-1, mid = 0;
        while(mid <= right){
            if(arr[mid] < a){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                mid++;
            } else if(arr[mid] <= b){
                mid++;
            } else if(arr[mid] > b){
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
}
