import java.util.Arrays;

public class NextPermutaion {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};

        System.out.println(Arrays.toString(nums));

        int indx = -1;
        int len = nums.length;
        for(int i=len-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                indx = i;
                break;
            }
        }
        if(indx == -1){
            int i = 0;
            len--;
            while(i<len){
                int k = nums[i];
                nums[i] = nums[len];
                nums[len] = k;
                i++;
                len--;
            }
        }
        else {
            for (int i = len - 1; i >= indx; i--) {
                if (nums[i] > nums[indx]) {
                    int k = nums[i];
                    nums[i] = nums[indx];
                    nums[indx] = k;
                    break;
                }
            }
            int j = indx + 1;
            len--;
            while (j < len) {
                int k = nums[j];
                nums[j] = nums[len];
                nums[len] = k;
                j++;
                len--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
