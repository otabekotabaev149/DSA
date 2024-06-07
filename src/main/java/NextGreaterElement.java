import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // this can work in 3ms
        Map<Integer, Integer> nextGreaterMap = new HashMap<>(nums2.length);
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }

        return result;

//        this can work in 4ms
//        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
//        Stack<Integer> stack = new Stack<>();
//
//        // Traverse nums2 from right to left
//        for (int i = nums2.length - 1; i >= 0; i--) {
//            int num = nums2[i];
//            // Maintain elements in stack that are greater than the current element
//            while (!stack.isEmpty() && stack.peek() <= num) {
//                stack.pop();
//            }
//            // If stack is not empty, the top element is the next greater element
//            nextGreaterMap.put(num, stack.isEmpty() ? -1 : stack.peek());
//            // Push the current element onto the stack
//            stack.push(num);
//        }
//
//        // Build the result for nums1 using the map
//        int[] result = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
//        }
//
//        return result;
    }
}
