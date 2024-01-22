public class rotateToLeft {
    public static void main(String[] args) {
        long arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 8, n = arr.length;
        System.out.println(rotate(arr, k, n));
    }
    static int rotate(long[] arr, int K, int N){
        if(K < arr[0] || K > arr[N-1]){
            return -1;
        }
        int st = 0;
        while(st <= N){
            int mid = (N+st)/2;
            if(arr[mid] == K){
                return 1;
            }
            else if(arr[mid] < K){
                st = mid+1;
            }
            else{
                N = mid;
            }
        }
        return -1;
    }
}
