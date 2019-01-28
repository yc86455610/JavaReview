package cn.yc.mycollection;

import javax.crypto.ExemptionMechanism;
import javax.management.modelmbean.ModelMBean;

/**
 * 自定义实现一个ArrayList，体会底层原理
 * 加入泛型
 */

public class YcArrayList02<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;


    //构造方法,默认
    public YcArrayList02() {
        elementData = new Object[DEFAULT_CAPACITY];

    }

    //构造方法的重载
    public YcArrayList02(int capacity) {
        elementData = new Object[capacity];
    }

    public void add(E element) {
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
        YcArrayList02<String> y2 = new YcArrayList02<>(20);
        y2.add("aa");
        y2.add("bb");

        System.out.println(y2);
    }


}