import java.util.ArrayList;
import java.util.Arrays;

public class AllocateBooks {
    public static void main(String[] args) {
        System.out.println(books(new int[] {12, 34, 67, 90}, 2));
        System.out.println(books(new int[] {5, 17, 100, 11}, 4));
        System.out.println(books(new int[] {73, 58, 30, 72, 44, 78, 23, 9}, 5));
        System.out.println(books(new int[] {31, 14, 19, 75}, 12));
    }

    private static int books(int[] arr, int n) {
        int len = arr.length, res = -1;

        if(len < n) return res;

        int low = 0, high = 0;
        for(int i=0;i<len;i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while(low <= high){
            int mid = (low + high) / 2;
            if(allocationIsPossible(arr, len, mid, n)){
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    private static boolean allocationIsPossible(int[] arr, int len, int mid, int n){
        int pages = 0, allocatedStd = 1;

        for(int i=0;i<len;i++){
            if(pages + arr[i] > mid){
                allocatedStd ++;
                pages = arr[i];
                if(allocatedStd > n) return false;
            } else {
                pages += arr[i];
            }
        }

        return allocatedStd <= n;
    }
}
