import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> ThreeSum(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(i != 0 && arr[i] == arr[i-1]) continue;

            int l = i+1;
            int r = len-1;
            while(l < r){
                int sum = arr[i] + arr[l] + arr[r];
                if(sum > 0){
                    r--;
                } else if(sum < 0){
                    l++;
                } else {
                    List<Integer> list = Arrays.asList(arr[i], arr[l], arr[r]);
                    res.add(list);
                    l++;
                    r--;

                    while(l < r && arr[l] == arr[l-1]) l++;
                    while(l < r && arr[r] == arr[r+1]) r--;
                }
            }
        }
        return res;
    }
}
