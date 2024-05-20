import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        backtracking(0, target, arr, new ArrayList<>(), list);
        return list;
    }

    static void backtracking(int ind, int target, int[] arr, List<Integer> ds, List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(ds));
            return;
        }
        int len = arr.length;
        for(int i=ind;i<len;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            backtracking(i+1, target-arr[i], arr, ds, list);
            ds.remove(ds.size()-1);
        }
    }

}
