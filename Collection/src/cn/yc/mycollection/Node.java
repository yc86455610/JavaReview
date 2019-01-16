package cn.yc.mycollection;

public class Node {

    Node previos;  //前驱结点
    Node next;    //后继结点
    Object element;  //元素数据



    public Node(Node previos, Node next, Object element) {
        super();
        this.previos = previos;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }
}
