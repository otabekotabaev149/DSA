public class FindMedianSortedArrays {
    public static void main(String[] args) {

    }

    private static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length, len2 = arr2.length;

        int i=0, j=0, count=0;
        int n = (len1 + len2);
        int ind2 = n / 2;
        int ind1 = ind2 - 1;

        int firstEl = -1, secondEl = -1;

        while(i < len1 && j < len2){

            if(arr1[i] < arr2[j]){
                if(count == ind1) firstEl = arr1[i];
                if(count == ind2) secondEl = arr1[i];
                count++;
                i++;
            }
            else {
                if(count == ind1) firstEl = arr2[j];
                if(count == ind2) secondEl = arr2[j];
                count++;
                j++;
            }
        }

        while(i < len1){
            if(count == ind1) firstEl = arr1[i];
            if(count == ind2) secondEl = arr1[i];
            count++;
            i++;
        }

        while(j < len2){
            if(count == ind1) firstEl = arr2[j];
            if(count == ind2) secondEl = arr2[j];
            count++;
            j++;
        }

        if((len1 + len2) % 2 == 1) return secondEl;

        return (double)((double)(firstEl + secondEl)) / 2.0;
    }
}
