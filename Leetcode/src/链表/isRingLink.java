package 链表;

//快慢指针确定链表中是否存在环（是否是循环链表）
public class isRingLink {
    public boolean isRingLink(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
