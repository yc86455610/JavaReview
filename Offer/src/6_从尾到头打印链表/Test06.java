//import java.lang.invoke.CallSite;
//import java.util.ArrayList;
//
///**
// * 从尾到头打印链表
// * <p>
// * <p>
// * 从尾到头反过来打印出每个结点的值。
// * <p>
// * 1、使用递归
// * 2、使用头插法
// * 3、使用栈
// */
//
//
//class Test06 {
//    public static void main(String[] args) {
//        Solution06 solution06 = new Solution06();
//        int[] input = {1, 2, 3, 3, 4, 4, 5};
//        ListNode listNode =
//    }
//}
//
//
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//
//
//class Solution06 {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> ret = new ArrayList<>();
//        if (listNode != null) {
//            ret.addAll(printListFromTailToHead(listNode.next));
//            ret.add(listNode.val);
//        }
//        return ret;
//    }
//}