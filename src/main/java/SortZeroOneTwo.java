import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, 1, 2, 1, 0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr){
        int len = arr.length;
        int left = 0, mid = 0, right = len-1;
        while(mid < right){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                mid++;
            } else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            } else {
                mid++;
            }
        }
    }
}
