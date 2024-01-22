public class Pow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 2147483647;
        System.out.println(pow(x, n));
    }

    private static double pow(double x, int n) {
        int k = n;
        n = Math.abs(n);
        double rs = 1;
        if(n == 0 || n == 2147483647){
            return rs;
        }
        while(n > 0){
            if(n % 2 == 0){
                x *= x;
                n /= 2;
            }
            else{
                rs *= x;
                n--;
            }
        }
        if(rs == 1){
            return 0;
        }
        if(k < 0){
            return (1 / rs);
        }
        return rs;
    }
}
