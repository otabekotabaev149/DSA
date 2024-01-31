public class IsPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int res = 0;
        int num = x;
        while(x > 9){
            res += x % 10;
            res *= 10;
            x /= 10;
        }
        res += x;
        if(num == res)
            return true;
        else
            return false;
    }
}
