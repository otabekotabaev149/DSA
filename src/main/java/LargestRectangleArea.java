import java.util.Stack;

public class LargestRectangleArea {
    public static void main(String[] args) {

    }

    public int largestRectangleArea(int[] arr) {
        int len = arr.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<len;i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()) left[i] = 0;
            else left[i] = stack.peek() + 1;
            stack.push(i);
        }
        while(!stack.isEmpty()) stack.pop();

        int maxA = 0;
        for(int i=len-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()) right[i] = len-1;
            else right[i] = stack.peek() - 1;

            maxA = Math.max(maxA, arr[i] * (right[i] - left[i] + 1));
            stack.push(i);
        }
        return maxA;
    }

    static int largestRectangleArea1(int arr[]) {
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || arr[st.peek()] >= arr[i])) {
                int height = arr[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
}
