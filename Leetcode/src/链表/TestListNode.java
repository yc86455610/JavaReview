package 链表;

public class TestListNode {
    /**
     * 24 交换链表中的相邻结点
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     * <p>
     * 题目要求：不能修改结点的 val 值，O(1) 空间复杂度。
     */

//    public ListNode swapPairs(ListNode head) {
//
//    }


    /**
     * 141 判断环形链表
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
        if (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    /**
     * 142  排序链表
     * 输入: -1->5->3->4->0
     * 输出: -1->0->3->4->5
     * <p>
     * 输入: 4->2->1->3
     * 输出: 1->2->3->4
     * <p>
     * O(n log n) 时间复杂度和常数级空间复杂度
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head, pre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l2.next, l1);
            return l2;
        }
    }



}
