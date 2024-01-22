public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int len = removeDuplicates(arr);
    }
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int ans = 1;
        int left = 1;
        if(len == 1){
            return len;
        }
        for(int i=1;i<len;i++){
            if(nums[i] != nums[i-1]){
                ans++;
                nums[left] = nums[i];
                left++;
            }
        }
        return ans;
    }
}
