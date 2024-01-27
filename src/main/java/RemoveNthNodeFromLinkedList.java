public class RemoveNthNodeFromLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);
        head.next.next.next.next = new ListNode(arr[4]);

        // Delete the Nth node from the end and print the modified linked list
        head = removeNthFromEnd(head, N);
        printLL(head);
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
