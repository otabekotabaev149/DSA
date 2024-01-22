import java.util.Vector;

public class MaxSubArrWithOnes {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        int n = arr.length;
        int m = 1;
        //System.out.println(findZeroes(arr, n, m));

        int arr1[] = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
        int m1 = 2;
        int n1 = arr.length;
        System.out.print("Index of zeroes that are flipped: [");
        Vector<Integer> result_index = maximized_one(arr1, n1, m1);
        for (int i : result_index) {
            System.out.print(i+ " ");
        }
        System.out.print("]");
    }

    static Vector<Integer> maximized_one(int arr[], int n, int m) {
        // Left array
        int left[] = new int[n];
        // Right array
        int right[] = new int[n];
        // Array will contain zeroes position
        Vector<Integer> zero_pos = new Vector<>();
        // Stores count
        int count = 0;
        int previous_index_of_zero = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                count++;
            } else {
                left[i] = count;
                zero_pos.add(i);
                if (previous_index_of_zero != i
                        && previous_index_of_zero != -1) {
                    right[previous_index_of_zero] = count;
                }
                count = 0;
                // To keep track of the previous index of zeroes
                previous_index_of_zero = i;
            }
        }
        right[previous_index_of_zero] = count;

        int max_one = -1;
        Vector<Integer> result_index = new Vector<>();
        int i = 0;

        while (i <= (zero_pos.size()) - m) {
            int temp = 0;
            Vector<Integer> index = new Vector<>();

            for (int c = 0; c < m; c++) {
                temp += left[zero_pos.elementAt(i + c)]
                        + right[zero_pos.elementAt(i + c)] + 1;
                // Index is updated
                index.add(zero_pos.elementAt(i + c));
            }
            // Decrement temp by m-1 because when we are
            // calculating temp we are adding 1 in it. So, in
            // order to get exact count of 1. This decrement is
            // applicable only when value of m is greater than 1
            temp = temp - (m - 1);
            // Updating max value when we get the new max temp
            // and result_index as well
            if (temp > max_one) {
                max_one = temp;
                result_index = index;
            }
            i += 1;
        }

        return result_index;
    }
}
