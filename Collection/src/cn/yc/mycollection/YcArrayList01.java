package cn.yc.mycollection;

import javax.crypto.ExemptionMechanism;
import javax.management.modelmbean.ModelMBean;

/**
 * 自定义实现一个ArrayList，体会底层原理
 *
 *
 * */

public class YcArrayList01 {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY=10;


    public YcArrayList01(){
        elementData = new Object[DEFAULT_CAPACITY];

    }

    public YcArrayList01(int capacity){

        elementData = new Object[capacity];
    }

    public void add(Object obj) {

        elementData[size++] = obj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //[a,b,c]
        sb.append("[");
        for(int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();
    }

    public static void main(String[] args) {
        YcArrayList01 y1 = new YcArrayList01(20);
        y1.add("aa");
        y1.add("bb");

        System.out.println(y1);
    }


}