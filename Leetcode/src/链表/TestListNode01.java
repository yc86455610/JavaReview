package 链表;

/**
 * 测试链表：
 * 1、翻转链表
 * 2、判断链表是否有环
 * 3、链表排序
 * 4、链表相加求和
 * 5、得到链表倒数第n个节点
 * 6、删除链表倒数第n个节点
 * 7、删除链表中重复的元素
 * 8、删除链表中重复的元素，去掉重复的节点
 * 9、旋转链表
 */

//翻转链表
public class TestListNode01 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        ListNode head = list.init();
        list.print(head);
    }

    public ListNode reverse(ListNode node) {
        ListNode prev = null;
        while (node != null) {
            ListNode tmp = node.next;
            node.next = prev;
            prev = node;
            node = tmp;
        }
        return prev;
    }
}