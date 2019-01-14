package cn.yc.simplePractice;

import java.util.concurrent.SynchronousQueue;
import java.util.zip.CheckedOutputStream;

/**
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * 在10万以内判断
 */
public class SqrtDigit {
    public static void main(String[] args) {
        int n = 10000;
        sqrtDigit(n);
    }

    private static void sqrtDigit(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num1 = (int) Math.sqrt(i + 100);
            int num2 = (int) Math.sqrt(i + 268);
            if (Math.pow(num1, 2) == (i + 100) && Math.pow(num2, 2) == (i + 268)) {
                System.out.print(i + "  ");
                count++;
                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n这样的数共有" + count + "个");
    }
}
