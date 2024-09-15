public class BestTimeToSellStock {
    public static void main(String[] args) {
        int[] arr = {3,2,6,5,0,3};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i < prices.length; i++)
        {
            if(prices[i] < minprice)
            {
                minprice = prices[i];
            }
            else if( prices[i] - minprice > maxProfit)
                maxProfit = prices[i] - minprice;
        }

        return maxProfit;
    }
}
