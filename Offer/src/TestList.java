import java.util.List;

/**java  单链表实现*/

 class ListNode {
    Object data;
    ListNode next;
}

public interface Linked{
    public ListNode get(int p);
    public void Insert(int p, Object data);
    public void delete(int p);
    public void clean();

}