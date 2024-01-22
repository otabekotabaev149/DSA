public class BestTimeToSellStock {
    public static void main(String[] args) {
        int[] arr = {3,2,6,5,0,3};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, lastMin=0, lastMax=0;
        for(int i=0;i<arr.length;i++){
            if (min > arr[i]){
                lastMin = min;
                min = arr[i];
                lastMax = max;
                max = arr[i];
            }
            if(max < arr[i]){
                lastMax = max;
                max = arr[i];
            }
        }
        if(max > min){
            return max-min;
        }
        else{
            if(lastMin < max){
                return max-lastMin;
            }
            else if(lastMin < lastMax){
                return lastMax - lastMin;
            }
            return 0;
        }
    }
}
