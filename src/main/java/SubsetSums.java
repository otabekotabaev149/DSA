import java.util.ArrayList;
import java.util.Collections;

public class SubsetSums {
    public static void main(String[] args) {

    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, n, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    void func(int ind, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> sumSubset){
        if(ind == n){
            sumSubset.add(sum);
            return;
        }

        func(ind+1, sum+arr.get(ind), arr, n, sumSubset);
        func(ind+1, sum, arr, n, sumSubset);
    }
}
