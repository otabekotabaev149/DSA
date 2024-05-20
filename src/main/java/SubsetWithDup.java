import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetWithDup {
    public static void main(String[] args) {

    }

    // My solution
    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        findSubsets(0, arr, new ArrayList<>(), list);
        return list;
    }

    static void findSubsets(int ind, int[] arr, List<Integer> ds, List<List<Integer>> list){
        int len = arr.length;
        list.add(new ArrayList<>(ds));
        for(int i=ind;i<len;i++){
            if(i != ind && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            findSubsets(i+1, arr, ds, list);
            ds.remove(ds.size() - 1);
        }
    }
}
