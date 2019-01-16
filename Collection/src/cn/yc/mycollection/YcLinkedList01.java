package cn.yc.mycollection;

import org.w3c.dom.ls.LSException;

/**
 * 自定义链表
 */

public class YcLinkedList01 {

    private Node first;
    private Node last;

    private int size;


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
        YcLinkedList01 list = new YcLinkedList01();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
    }
}
