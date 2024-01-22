public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr(arr));
        int[] ar = {-2, -1};
        System.out.println(maxSubArr(ar));

    }

    private static int maxSubArr(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
