import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> low; // max-heap
    private PriorityQueue<Integer> high; // min-heap

    /** Initialize your data structure here. */
    public MedianFinder() {
        low = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        high = new PriorityQueue<>(); // min-heap
    }

    public void addNum(int num) {
        // Add to max-heap
        low.add(num);

        // Balance the heaps by ensuring the smallest of high is greater than the largest of low
        if (!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()) {
            high.add(low.poll());
        }

        // Balance sizes
        if (low.size() > high.size() + 1) {
            high.add(low.poll());
        } else if (high.size() > low.size()) {
            low.add(high.poll());
        }
    }

    public double findMedian() {
        if (low.size() == high.size()) {
            return (low.peek() + high.peek()) / 2.0;
        } else {
            return low.peek();
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        System.out.println(medianFinder.findMedian()); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(5);    // arr = [1, 2, 3]
        System.out.println(medianFinder.findMedian()); // return 2.0
    }
}
