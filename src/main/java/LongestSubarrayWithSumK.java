public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int A[] = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        System.out.println(subArray(A, A.length, 15));
        int B[] = {-1, 2, 3};
        System.out.println(subArray(B, B.length, 6));
    }

    private static int subArray(int[] A, int N, int K) {
        int sum = 0, len = 0, start=0;
        int maxLen=0;
        for(int i=0;i<N;i++){
            sum += A[i];
            if(sum <= K){
                len++;
            }
            else{
                maxLen = Math.max(maxLen, len);
                len++;
                while(sum > K){
                    sum -= A[start];
                    start++;
                }
                len -= start;
            }
        }
        return maxLen;
    }
}
