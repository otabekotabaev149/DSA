public class PlusOne {
    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] arr) {
        int len = arr.length;
        boolean tens = true;
        int i = len - 1;
        arr[i] ++;
        if(arr[i] >= 10){
            while(tens && i > 0){
                arr[i] %= 10;
                i--;
                arr[i]++;
                if(arr[i] < 10){
                    tens = false;
                }
            }
        } else {
            return arr;
        }
        arr[i]++;
        if(arr[i] < 10){
            tens = false;
        }
        if(tens){
            len++;
            int[] arr2 = new int[len];
            arr2[0] = 1;
            for(i=0;i<len;i++){
                arr2[i+1] = arr[i];
            }
            return arr2;
        }
        return arr;
    }
}
