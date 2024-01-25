import java.util.HashMap;

public class NRepetedElement {
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
    }

    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) > 1){
                return nums[i];
            }
        }
        return 0;
    }
}
