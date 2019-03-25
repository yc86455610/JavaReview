import java.util.List;

public class Merge {
    //合并两个排序的链表

    public ListNode Merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val <= l2.val) {
            l1.next = Merge(l1.next, l2);
            return l1;
        } else {
            l2.next = Merge(l1, l2.next);
            return l2;
        }
    }
}
