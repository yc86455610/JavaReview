


public class YcArrayList<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    //构造方法
    public YcArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    //构造方法的重载
    public YcArrayList(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("容器容量不能为负数：" + capacity);
        } else if (capacity == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            elementData = new Object[capacity];
        }
    }

    //size() and isEmpty()
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    //add()
    public void add(E element) {
//        if () {
//
//        }

        elementData[size++] = element;
    }

    //set() and get()
    public void set(E element, int index) {
        elementData[index] = element;
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    //remove()
//    public void


    public static void main(String[] args) {
        YcArrayList<String> y1 = new YcArrayList<>();

        y1.set("aaaa", 9);
        System.out.println(y1);


    }

}
