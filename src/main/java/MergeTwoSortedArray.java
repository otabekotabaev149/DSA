public class MergeTwoSortedArray {
    public static void main(String[] args) {


        int arr1[] = {1, 2, 3, 0, 0, 0};

        int arr2[] = {2, 5, 6};

//        nums1 = {2, 5, 6, 0, 5, 6}

//        nums2 = {1, 2, 3}


        merge(arr1, 3, arr2, 3);


    }

    private void merge2(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1; // Pointer for the last position in nums1
        m--; // Pointer for the last element in the initial part of nums1
        n--; // Pointer for the last element in nums2

        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[len] = nums1[m];
                m--;
            } else {
                nums1[len] = nums2[n];
                n--;
            }
            len--;
        }

        // If there are any remaining elements in nums2, copy them
        while (n >= 0) {
            nums1[len] = nums2[n];
            len--;
            n--;
        }
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
        while(m >= 0){
            arr1[len] = arr1[m];
            len--;
            m--;
        }
        while(n >= 0){
            arr1[len] = arr2[n];
            len--;
            n--;
        }
    }
}
