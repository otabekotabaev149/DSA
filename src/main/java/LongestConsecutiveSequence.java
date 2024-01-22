import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));

    }
    public static int longestConsecutive(int[] nums) {
        int len = 1;
        int l = nums.length;
        Arrays.sort(nums);
        int i=1, mx = 0;
        while(i<l){
            if(nums[i] - nums[i-1] == 1){
                len++;
            }
            else{
                mx = Math.max(mx, len);
                len = 1;
            }
            i++;
        }
        mx = Math.max(mx, len);
        return mx;
    }
}
