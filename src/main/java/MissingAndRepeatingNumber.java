public class MissingAndRepeatingNumber {
    public static void main(String[] args) {

    }

    private int[] repeatedNumber(final int[] nums) {

        int n = nums.length;

        // Calculate the expected sum and sum of squares
        long sum_n = (long) n * (n + 1) / 2;
        long sum_squares_n = (long) n * (n + 1) * (2 * n + 1) / 6;

        // Calculate the actual sum and sum of squares from the array
        long sum_actual = 0;
        long sum_squares_actual = 0;

        for (int num : nums) {
            sum_actual += num;
            sum_squares_actual += (long) num * num;
        }

        // Calculate the differences
        long sum_diff = sum_n - sum_actual; // B - A
        long sum_squares_diff = sum_squares_n - sum_squares_actual; // B^2 - A^2

        // sum_squares_diff = (B - A)(B + A)
        long B_plus_A = sum_squares_diff / sum_diff;

        // Solve for B and A
        long B = (sum_diff + B_plus_A) / 2;
        long A = B - sum_diff;

        return new int[]{(int) A, (int) B};
    }
}
