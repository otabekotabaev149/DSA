import java.util.Arrays;

public class Frequencies_of_Limited_Range_Array_Elements {
    public static void main(String[] args) {
        int arr[] = {3,3,3,3};
        int N = 4;
        int P = 3;
        frequencyCount(arr, N, P);
    }

    static void frequencyCount(int[] arr, int N, int p){
        int newArr[] = Arrays.copyOf(arr, N);
        Arrays.fill(arr, 0);
        for(int i=0;i<N;i++){
            if(newArr[i] <= N){
                arr[newArr[i]-1]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
