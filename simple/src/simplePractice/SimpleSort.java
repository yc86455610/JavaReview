package cn.yc.simplePractice;

import java.net.SocketTimeoutException;
import java.util.Scanner;

/**
 * 普通排序
 * 输入三个整数x,y,z，请把这三个数由小到大输出
 */
public class SimpleSort {
    public static void main(String[] args) {

        System.out.println("请输入任意的排序数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        sorting(a, b, c);
        scanner.close();
    }

    //实现普通排序
    private static void sorting(int num1, int num2, int num3) {
        int temp = 0;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("三个数从小到大排列为：" + num1 + " " + num2 + " " + num3);

    }

}