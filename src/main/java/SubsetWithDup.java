import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetWithDup {
    public static void main(String[] args) {

    }

    // My solution
    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int len = arr.length;
        for(int i=0;i< (1<<len);i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<len;j++){
                if((i & (1<<j)) != 0){
                    l.add(arr[j]);
                }
            }
            Collections.sort(l);
            if(!list.contains(l)) {
                list.add(l);
            }
        }
        return list;
    }
}
