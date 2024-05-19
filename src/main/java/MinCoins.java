import java.util.Arrays;
import java.util.Collections;

public class MinCoins {
    public static void main(String[] args) {
        System.out.println(minCoins(new int[]{9, 2, 11, 5, 14, 17, 8, 18}, 8, 39));
//        System.out.println(minCoins(new int[]{25, 10, 5}, 3, 30));
//        System.out.println(minCoins(new int[]{9, 6, 5, 1}, 4, 11));
//        System.out.println(minCoins(new int[]{3, 7, 4}, 3, 49));
    }

    public static int minCoins(int arr[], int M, int V) {
        // Array to store the minimum number of coins for each value up to V
        int[] dp = new int[V + 1];

        // Initialize dp array with a large value (greater than the possible max coins needed)
        Arrays.fill(dp, V + 1);

        // Base case: no coins are needed to make zero value
        dp[0] = 0;

        // Iterate over each coin
        for (int i = 0; i < M; i++) {
            // Update dp array for each value from the coin's value up to V
            for (int j = arr[i]; j <= V; j++) {
                // If we include the coin[i], check if it reduces the number of coins needed
                dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
            }
        }

        // If dp[V] is still greater than V, it means we can't make change for V
        return dp[V] > V ? -1 : dp[V];
    }
}
