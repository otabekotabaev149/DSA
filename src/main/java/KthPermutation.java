import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    public static void main(String[] args) {

    }

    public static String getPermutation(int n, int k) {
        String ans = "";
        int fac = 1;
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<n;i++){
            arr.add(i);
            fac *= i;
        }
        arr.add(n);
        k--;
        while(true){
            ans += arr.get(k / fac);
            arr.remove(k / fac);
            if(arr.size() == 0){
                break;
            }
            k %= fac;
            fac /= arr.size();
        }
        return ans;
    }
}
