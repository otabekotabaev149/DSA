public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        merge(arr1, 3, arr2, 3);
    }

    private static void merge(int[] arr1, int m, int[] arr2, int n) {
        int len = arr1.length-1;
        m--;
        n--;
        while(m >= 0 && n >= 0){
            if(arr1[m] >= arr2[n]){
                arr1[len] = arr1[m];
                m--;
            }
            else {
                arr1[len] = arr2[n];
                n--;
            }
            len--;
        }
        if(m >= 0){
            while(m >= 0){
                arr1[len] = arr1[m];
                len--;
                m--;
            }
        }
        else if(n >= 0){
            while(n >= 0){
                arr1[len] = arr2[n];
                len--;
                n--;
            }
        }
        for(int lk : arr1){
            System.out.print(lk + " ");
        }
    }
}
