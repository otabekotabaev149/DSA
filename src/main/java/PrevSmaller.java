import java.util.Arrays;
import java.util.Stack;

public class PrevSmaller {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prevSmaller(new int[]{34, 35, 27, 42, 5, 28, 39, 20, 28})));
    }

    private static int[] prevSmaller(int[] arr) {
        int len = arr.length;
        int[] as = new int[len];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<len;i++){
            while(!stack.isEmpty() && arr[i] <= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                as[i] = -1;
            } else {
                as[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return as;
    }
}
