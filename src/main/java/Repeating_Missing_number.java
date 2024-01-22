import java.util.HashMap;
import java.util.Map;

public class Repeating_Missing_number {
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,3};
        int len = arr.length;
        int sum1 = (len * (len+1)) / 2;
        int sum2 = 0, same=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            sum2 += arr[i];
            if(map.containsKey(arr[i])){
                same = arr[i];
            }
            else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(sum1 - (sum2-same));
    }
}
