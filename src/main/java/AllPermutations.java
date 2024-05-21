import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AllPermutations {
    public static void main(String[] args) {

    }

    // first approach
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i : nums) {
                if (tempList.contains(i)) continue; // element already exists, skip
                tempList.add(i);
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    /**
     * Second approach
     * @param arr
     * @return
     */
    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        func(0, arr, list);
        return list;
    }

    private static void func(int ind, int[] arr, List<List<Integer>> list){
        if(ind == arr.length){
            List<Integer> ds = new ArrayList<>();
            Arrays.stream(arr).forEach(i -> ds.add(i));
            list.add(new ArrayList<>(ds));
        }
        for(int i=ind;i<arr.length;i++){
            swap(arr, i, ind);
            func(ind+1, arr, list);
            swap(arr, i, ind);
        }
    }

    private static void swap(int[] arr, int ind, int i) {
        int temp = arr[ind];
        arr[ind] = arr[i];
        arr[i] = temp;
    }
}
