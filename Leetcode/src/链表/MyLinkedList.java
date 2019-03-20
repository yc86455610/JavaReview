package 链表;

public class MyLinkedList {
    public ListNode head;
    public ListNode current;

    public void add(int data) {
        if (head == null) {
            head = new ListNode(data);
            current = head;
        } else {
            current.next = new ListNode(data);
            current = current.next;
        }
    }

    //打印链表
    public void print(ListNode listNode) {
        if (listNode == null) {
            return;
        }
        current = listNode;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    //初始化链表,返回表头
    public ListNode init() {
        for (int i = 0; i < 10; i++) {
            this.add(i);
        }
        return head;
    }

    //求链表长度
    public int get_length(ListNode head) {
        if (head == null) {
            return -1;
        }

        int length = 0;
        current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

}
