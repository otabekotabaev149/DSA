import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        twoSum(arr, 9);
    }

    private static void twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                int[] result = {map.get(target-arr[i]), i};
            }
            else{
                map.put(arr[i], i);
            }
        }

    }
}
