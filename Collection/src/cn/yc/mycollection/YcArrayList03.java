package cn.yc.mycollection;

import java.util.logging.Level;

/**
 * 自定义实现一个ArrayList，体会底层原理
 * 加入数组扩容
 */

public class YcArrayList03<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;


    //构造方法,默认
    public YcArrayList03() {
        elementData = new Object[DEFAULT_CAPACITY];

    }

    //构造方法的重载
    public YcArrayList03(int capacity) {
        elementData = new Object[capacity];
    }

    public void add(E element) {

        //什么时候扩容？？
        if (size == elementData.length) {
            //怎么扩容？？扩容操作
            //10--->10+10>>2=15
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];

            //数组拷贝,旧数组拷贝到新数组
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }

        elementData[size++] = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //[a,b,c]
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');

        return sb.toString();
    }

    public static void main(String[] args) {
        YcArrayList03 y2 = new YcArrayList03();
        for (int i = 0; i < 40; i++) {
            y2.add("yc" + i);
        }

        System.out.println(y2);
    }


}