public class DuplicateInArray {
    public static void main(String[] args) {

    }

    // Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    //
    // There is only one repeated number in nums, return this repeated number.
    //
    // You must solve the problem without modifying the array nums and uses only constant extra space.
    private int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while(slow != fast);

        fast = arr[0];

        while(fast != slow){
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }
}
