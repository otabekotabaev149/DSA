public class DetectCyrcle2 {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                while(slow != entry){
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow;
            }
        }
        return null;
    }
}
