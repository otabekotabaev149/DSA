public class RotateLinkedList {
    public static void main(String[] args) {

    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;

        ListNode fast = head;
        ListNode slow = head;
        int len = 0;

        for(int i=0;i<k;i++){
            if(fast.next != null){
                fast = fast.next;
            } else {
                len = i+1;
                fast = head;
                break;
            }
        }
        if(len != 0){
            k %= len;
            for(int i=0;i<k;i++){
                fast = fast.next;
            }
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}
