package 链表;

// 求单链表中倒数第k个节点

public class FindKthToTail {
    //双指针，快指针先移动k-1步，然后快慢指针一起移动，当快指针到达尾节点，慢指针正好指向倒数第k个节点
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode fast = head;
        while (fast != null && k-- > 0) {
            fast = fast.next;
        }
        if (k > 0) return null;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
