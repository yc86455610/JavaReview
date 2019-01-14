package cn.yc.simplePractice;

import java.util.Scanner;

/**
 * 古典问题，兔子问题，斐波那契数列
 *
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子。
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 *
 *
 * */
public class ClassicQuestion {
    public static void main(String[] args) {
        System.out.println("输入你想知道兔子数量的月份：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //获取输入的整数
        System.out.println("第"+n+"个月兔子总数是："+func(n));
    }

    private static int func(int n ) {
        if (n==1 | n==2 ){
            return 1;
        }else {
            return func(n-1) +func(n-2);
        }
    }
}
