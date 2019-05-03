package 链表;

public class findMiddleNode {
    //找出单链表的中间节点,使用快慢指针
    public ListNode findMiddleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
