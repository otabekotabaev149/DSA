import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {

    }

    public static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, list);
        return list;
    }

    private static void func(int ind, String s, List<String> path, List<List<String>> list) {
        if(ind == s.length()){
            list.add(new ArrayList<>(path));
            return;
        }

        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s, ind, i)){
                path.add(s.substring(ind, i+1));
                func(i+1, s, path, list);
                path.remove(path.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String str, int left, int right) {
        while (left <= right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
