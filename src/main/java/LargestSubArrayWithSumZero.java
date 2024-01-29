import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumZero {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == 0){
                max = i+1;
            } else {
                if(map.get(sum) != null){
                    max = Math.max(max, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
}
