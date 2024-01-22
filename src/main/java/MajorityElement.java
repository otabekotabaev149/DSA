public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {6, 5, 5};
        majorityElement(nums);
    }

    private static void majorityElement(int[] arr) {
        int count=0;
        int el=arr[0];
        for(int i : arr){
            if(i == el){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                el = i;
                count++;
            }
        }
        System.out.println(el);
    }
}
