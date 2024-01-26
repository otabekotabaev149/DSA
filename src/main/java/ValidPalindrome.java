import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        Pattern pattern = Pattern.compile("[a-z0-9]");
        Matcher matcher = pattern.matcher(s);
        String str = "";
        while(matcher.find()){
            str += matcher.group();
        }
        if(str.equals(new String(new StringBuilder(str).reverse()))){
            return true;
        } else {
            return false;
        }
    }
}
