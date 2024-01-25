public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int changeToInt(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int res = 0, len = arr.length;
        if(len == 1){
            return changeToInt(arr[0]);
        }
        for(int i=0;i<len-1;i++) {
            int current = changeToInt(arr[i]);
            if (current < changeToInt(arr[i + 1])) {
                res -= current;
            } else {
                res += current;
            }
        }
        res += changeToInt(arr[len-1]);
        return res;
    }
}
