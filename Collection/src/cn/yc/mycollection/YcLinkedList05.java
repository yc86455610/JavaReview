package cn.yc.mycollection;

/**
 * 自定义链表
 * 增加小的封装、添加泛型
 */

public class YcLinkedList05<E> {

    private Node first;
    private Node last;

    private int size;
    private Node temp;

    //插入节点
    public void add(int index, E element) {   //shift+f6

        checkRange(index);

        Node newNode = new Node(element);
        Node temp = getNode(index);

        if (temp != null) {
            Node prev = temp.previous;

            prev.next = newNode;
            newNode.previous = prev;

            newNode.next = temp;
            temp.previous = newNode;

        }
    }

    //添加remove方法
    public void remove(int index) {

        checkRange(index);

        Node temp = getNode(index);

        if (temp != null) {
            Node prev = temp.previous;
            Node next = temp.next;

            if (prev != null) {
                prev.next = next;
            }

            if (next != null) {
                next.previous = prev;
            }

            //被删除的元素是第一个元素
            if (index == 0) {
                first = next;
            }

            //被删除的元素是最后一个元素
            if (index == size - 1) {
                last = prev;
            }
            size--;
        }
    }

    //添加get方法
    //["a","b","c","d","e"]  index=2
    public E get(int index) {
//        System.out.println(size);

        checkRange(index);

        Node temp = getNode(index);

        return temp != null ? (E) temp.element : null;
    }

    private void checkRange(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引数字不合法：" + index);
        }
    }

    //封装由index得到的node
    private Node getNode(int index) {

        checkRange(index);

        Node temp = null;

        if (index <= (size >> 1)) { //size>>1相当于除以2
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previous;
            }
        }

        return temp;
    }


    //[]
    //["a","b"]
    public void add(E element) {
        Node node = new Node(element);

        if (first == null) {
//          node.previos = null;
//          node.next = null;

            first = node;
            last = node;
        } else {

            node.previous = last;
            node.next = null;

            last.next = node;
            last = node;

        }
        size++;

    }

    @Override
    public String toString() {
        //[a,b,c]  first=a,last=c
        //a,b,c
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while (temp != null) {
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        YcLinkedList05<String> list = new YcLinkedList05<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list);

        System.out.println(list.get(1));
    }
}
