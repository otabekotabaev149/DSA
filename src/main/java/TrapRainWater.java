public class TrapRainWater {
    public static void main(String[] args) {

    }

    public static int trap(int[] arr) {
        int len = arr.length;
        int left = 0, right = len-1;
        int leftMax = 0, rightMax = 0;
        int res = 0;
        while(left <= right){
            if(arr[left] <= arr[right]){
                if(leftMax <= arr[left]){
                    leftMax = arr[left];
                } else {
                    res += leftMax - arr[left];
                }
                left++;
            } else {
                if(rightMax <= arr[right]){
                    rightMax = arr[right];
                } else {
                    res += rightMax - arr[right];
                }
                right--;
            }
        }
        return res;
    }
}
