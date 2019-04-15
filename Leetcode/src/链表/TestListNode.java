package 链表;

public class TestListNode {
    /**
     * 24 交换链表中的相邻结点
     *  Given 1->2->3->4, you should return the list as 2->1->4->3.
     *
     *  题目要求：不能修改结点的 val 值，O(1) 空间复杂度。
     * */

    public ListNode swapPairs(ListNode head) {

    }


    /**
     * 141 判断环形链表
     *
     * */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
        if(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
