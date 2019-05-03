public class EntryNodeOfLoop {
    //链表中环的入口节点
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        /**
         * 快慢指针，相遇后，让fast指针重新从头开始移动，速度与slow指针相同
         * 则fast和slow会在环入口点相遇
         * */

        if (pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead, fast = pHead;

        //快慢指针相遇
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while (slow != fast);

        //fast指针从头遍历，速度与slow相同
        fast = pHead;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
