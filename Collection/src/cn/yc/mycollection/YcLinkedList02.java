package cn.yc.mycollection;

/**
 * 自定义链表
 * 添加get方法，返回指定索引的对象
 *
 */

public class YcLinkedList02 {

    private Node first;
    private Node last;

    private int size;

    //添加get方法
    public Object get(int index) {
//        System.out.println(size);

        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引数字不合法：" + index);
        }

        //["a","b","c","d","e"]  index=2
        Node temp = null;

        if (index <= (size >> 1)) { //size>>1相当于除以2
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previos;
            }
        }

        return temp.element;
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

            node.previos = last;
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
        YcLinkedList02 list = new YcLinkedList02();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println(list.get(5));
    }
}
