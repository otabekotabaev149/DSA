public class MergeTwoLinkedList {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode first = list1;
        ListNode sec = list2;
        while(first.next != null){
            if(first.val > sec.val){
                swap(first, sec);
                while(sec.next != null && sec.val > sec.next.val){
                    swap(sec, sec.next);
                    sec = sec.next;
                }
                sec = list2;
            }
            first = first.next;
        }
        first.next = list2;
        while(first.next != null && first.val > first.next.val){
            swap(first, first.next);
            first = first.next;
        }
        return list1;
    }

    public static void swap(ListNode a, ListNode b){
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
}
