package cn.yc.mycollection;


/**
 * 自定义实现一个ArrayList，体会底层原理
 * 增加set和get方法
 * 增加数组边界的检查
 */

public class YcArrayList04<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;


    //构造方法,无参默认
    public YcArrayList04() {
        elementData = new Object[DEFAULT_CAPACITY];

    }

    //构造方法的重载
    public YcArrayList04(int capacity) {

        if (capacity < 0) {
            throw new RuntimeException("容器容量不能为负数：" + capacity);
        } else if (capacity == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            elementData = new Object[capacity];
        }
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

    public void checkRange(int index) {
        //判断index是否合法[0,size)  10  0-9
        if (index < 0 || index > size - 1) {
            //不合法,手动抛出异常
            throw new RuntimeException("索引不合法: " + index);
        }
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
        YcArrayList04 y2 = new YcArrayList04();
        for (int i = 0; i < 40; i++) {
            y2.add("yc" + i);
        }

        y2.set("aaaa", 10);

        System.out.println(y2);

        System.out.println(y2.get(39));
    }

}