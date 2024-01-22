import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> list = generate(7);
        System.out.println(list);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        tr.add(list);
        if(numRows == 1){
            return tr;
        }
        list = new ArrayList<>();
        list.add(1);
        list.add(1);
        tr.add(list);
        if(numRows == 2){
            return tr;
        }

        int[][] m = new int[numRows][numRows];
        m[0][0] = 1;
        m[1][0] = 1;
        m[1][1] = 1;
        for(int i=2;i<numRows;i++) {
            list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = m[i - 1][j] + m[i - 1][j - 1];
                }
                list.add(m[i][j]);
            }
            tr.add(list);
        }
        return tr;
    }
}
