public class MaxProfit {
    public static void main(String[] args) {

    }

    private int maxProfit(int[] arr){
        int profit = 0, len = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            min = Math.min(arr[i], min);
            profit = Math.max(arr[i] - min, profit);
        }
        return profit;
    }
}
