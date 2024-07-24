import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

    }

    private int[][] mergeIntervals(int[][] intervals){
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Initialize the first interval as the current interval to be merged
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            // Check if there is an overlap
            if (currentEnd >= nextStart) {
                // If there is an overlap, merge the intervals
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // If there is no overlap, add the new interval to the list
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);

    }
}
