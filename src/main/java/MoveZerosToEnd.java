import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 0, 2, 1, 0, 3, 4};

        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));
    }

    private static int[] moveZeroesToEnd(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len-1;

        int[] arr2 = new int[len];
        for(int i=0;i<len;i++){
            if(arr[i] == 0){
                arr2[right] = 0;
                right--;
            } else {
                arr2[left] = arr[i];
                left++;
            }
        }
        arr = Arrays.copyOf(arr2, len);
        System.out.println("ss  "+Arrays.toString(arr2));
//        while(left < right){
//            if(arr[right] == 0){
//                right--;
//            } else if(arr[left] == 0){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            } else {
//                left++;
//            }
//        }
        return arr;
    }
}
