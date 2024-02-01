public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] arr) {
        int len = arr.length;
        if(len == 1) return 1;
        int resLen = 1;
        int i = 1;
        while(i < len){
            if(arr[i] == arr[i-1]){
                i++;
            } else {
                arr[resLen] = arr[i];
                resLen++;
                i++;
            }
        }
        return resLen;
    }
}
