package 链表;


//反转单链表
public class ReverseList {
    //递归
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList(next);
        next.next = head;
        return newHead;
    }

    //迭代,三指针
    public ListNode ReverseList2(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = null;
        return pre;
    }

    //栈
}
