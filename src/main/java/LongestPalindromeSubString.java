import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("slnjbadabslfjn"));
        System.out.println(longestPalindrome("babadababsfs"));
        System.out.println(longestPalindrome("lsabbajjj"));

        System.out.println(longestPalindrome("aaaa"));
    }

    private static String longestPalindrome(String s) {

        if(s == null || s.isEmpty()) return "";

        char[] arr = s.toCharArray();
        int len = arr.length;
        if(len == 1) return s;

        int start = 0, end = 0;

        int currentIndex = 0;
        while(currentIndex < len-1) {
            int left = currentIndex;
            int right = currentIndex;
            while(right < len-1 && arr[right] == arr[right + 1]) {
                right++;
            }

            currentIndex = right;

            while(left > 0 && right < len - 1 && arr[left - 1] == arr[right + 1]) {
                left--;
                right++;
            }

            if((end - start) < (right - left)) {
                end = right;
                start = left;
            }

            currentIndex++;
        }

        return s.substring(start, end + 1);
    }
}
