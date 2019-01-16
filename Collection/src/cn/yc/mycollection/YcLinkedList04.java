package cn.yc.mycollection;

/**
 * 自定义链表
 * 插入节点
 *
 * 三个节点：prev、newNode、temp(在index位置插入节点)
 *
 * 首尾节点的插入问题？？？
 */

public class YcLinkedList04 {

    private Node first;
    private Node last;

    private int size;

    //插入节点
    public void add(int index, Object obj){

        Node newNode = new Node(obj);
        Node temp = getNode(index);

        if(temp!=null){
            Node prev = temp.previous;

            prev.next=newNode;
            newNode.previous=prev;

            newNode.next=temp;
            temp.previous=newNode;

        }
    }

    //添加remove方法
    public void remove(int index) {
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
    public Object get(int index) {
//        System.out.println(size);

        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引数字不合法：" + index);
        }
        Node temp = getNode(index);

        return temp != null ? temp.element : null;
    }


    //封装由index得到的node
    public Node getNode(int index) {

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
    public void add(Object obj) {
        Node node = new Node(obj);

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
        YcLinkedList04 list = new YcLinkedList04();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println(list);
        list.add(3,8);
        System.out.println(list);
        list.add(3,"yc");
        System.out.println(list);
    }
}
