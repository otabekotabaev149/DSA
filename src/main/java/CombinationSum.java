import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(0, arr, target, new ArrayList<>(), list);
        return list;
    }

    static void backtrack(int ind, int[] arr, int target, List<Integer> ds, List<List<Integer>> list){
        if(ind == arr.length) {
            if(target == 0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            backtrack(ind, arr, target-arr[ind], ds, list);
            ds.remove(ds.size()-1);
        }
        backtrack(ind+1, arr, target, ds, list);
    }
}