public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        boolean tens = false;
        ListNode result = l1;
        while(l1.next != null || l2.next != null){
            if(l1.next == null && l2.next != null)
                l1.next = new ListNode(0);
            if(l2.next == null && l1.next != null)
                l2.next = new ListNode(0);
            l1.val = l1.val+l2.val;
            if(tens){
                l1.val++;
                tens = false;
            }
            if(l1.val >= 10){
                l1.val = l1.val % 10;
                tens = true;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        l1.val = l1.val + l2.val;
        if(tens) l1.val++;
        if(l1.val >= 10){
            l1.val %= 10;
            l1.next = new ListNode(1);
        }
        return result;
    }
}
