import java.util.ArrayList;
import java.util.List;

public class ListOfSubSet {
    public static void main(String[] args) {
//        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

    }

    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();

        int len = arr.length;
        for(int i=0;i< (1<<len);i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<len;j++){
                if((i & (1<<j)) != 0){
                    l.add(arr[j]);
                }
            }
            list.add(l);
        }
        return list;
    }
}
