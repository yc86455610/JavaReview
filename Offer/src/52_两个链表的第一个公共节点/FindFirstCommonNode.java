public class FindFirstCommonNode {
    //(a+c)+b = (b+c)+a
    //当一个链表访问到其尾部时，接下来访问另一个链表的头部，这样可以保证同时访问到同一个相交节点

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1, l2 = pHead2;
        while (l1 != l2) {
            l1 = (l1 == null) ? pHead2 : l1.next;
            l2 = (l2 == null) ? pHead1 : l2.next;
        }
        return l1;
    }
}
