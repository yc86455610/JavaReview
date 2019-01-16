package cn.yc.mycollection;


import javax.xml.stream.events.EndElement;
import java.rmi.Remote;

/**
 * 自定义实现一个ArrayList，体会底层原理
 * 已有add、set、get方法
 * <p>
 * 增加remove方法(element and index)
 */

public class YcArrayList05<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;


    //构造方法,无参默认
    public YcArrayList05() {
        elementData = new Object[DEFAULT_CAPACITY];

    }

    //构造方法的重载
    public YcArrayList05(int capacity) {

        if (capacity < 0) {
            throw new RuntimeException("容器容量不能为负数：" + capacity);
        } else if (capacity == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            elementData = new Object[capacity];
        }
    }


    //添加size和isEmpty方法
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    //添加add方法
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

    //添加get方法
    public E get(int index) {
        checkRange(index);

        return (E) elementData[index];
    }

    //添加set方法
    public void set(E element, int index) {

        checkRange(index);
        elementData[index] = element;

    }

    //判断index是否合法[0,size)  10  0-9
    public void checkRange(int index) {
        if (index < 0 || index > size - 1) {
            //不合法,手动抛出异常
            throw new RuntimeException("索引不合法: " + index);
        }
    }

    public void remove(E element) {
        //element，把他和所有元素挨个比较，获得第一个比较为true返回
        for (int i = 0; i < size; i++) {
            if (element.equals(get(i))) {   //容器中做的所有比较都使用equals方法,而不是==

                //把该元素从此处移除????
                remove(i);
            }
        }
    }

    public void remove(int index) {
        //a,b,c,d,e,f,g,h
        //a,b,c,e,f,g,h,h
        int numMoved = elementData.length - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }

        //拷贝后最后一个元素还在，需要置为null，最后元素个数-1
        elementData[--size] = null;
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
        YcArrayList05 y2 = new YcArrayList05();
        for (int i = 0; i < 40; i++) {
            y2.add("yc" + i);
        }

        y2.set("aaaa", 10);

        System.out.println(y2);

        System.out.println(y2.get(39));

        y2.remove(3);
        y2.remove("yc11");
        System.out.println(y2);
        System.out.println(y2.size());
        System.out.println(y2.isEmpty());

    }

}