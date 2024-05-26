public class SingleNonDuplicate {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,7,7,8,8}));
    }

    private static int singleNonDuplicate(int[] arr) {
        int low = 0, high = arr.length-2;
        while(low <= high){
            int mid = (low + high) / 2;
            if(mid % 2 == 0){
                if(arr[mid] != arr[mid+1]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(arr[mid] == arr[mid-1]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return arr[low];
    }
}
