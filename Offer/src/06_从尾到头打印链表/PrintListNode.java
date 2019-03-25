import java.util.ArrayList;
import java.util.Stack;

public class PrintListNode {
    //从头到尾打印链表
    //栈
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty())
            ret.add(stack.pop());
        return ret;
    }

    //递归

}
