public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 5;
        rotateToRight(arr, k);
    }

    private static void rotateToRight(int[] arr, int k) {
        int len = arr.length;
        k = len - (k%len);
        int ar[] = new int[k];
        int j = k, i;
        for(i=0;i<k;i++){
            ar[i] = arr[i];
            if(j<len){
                arr[i] = arr[j++];
            }
        }
        while(j<len){
            arr[i++] = arr[j++];
        }
        for(i=len-k;i<len;i++){
            arr[i] = ar[i- (len-k)];
        }
        for(i=0;i<len;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
