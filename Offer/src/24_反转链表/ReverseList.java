public class ReverseList {
    //输入一个链表，反转链表后，输出新链表的表头。

    public ListNode ReverseList1(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList1(next);
        next.next = head;
        return newHead;
    }

    public ListNode ReverseList2(ListNode head) {
        ListNode newList = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList.next;
    }
}
