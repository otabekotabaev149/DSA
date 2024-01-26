public class BinSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{3}, 3));
    }

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
}
