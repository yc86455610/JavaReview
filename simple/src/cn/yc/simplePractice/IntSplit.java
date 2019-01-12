package cn.yc.simplePractice;

import java.util.Scanner;

/**
 * 正整数分解
 * 输入90,打印出90=2*3*3*5
 *
 * 1、先找到最小的质数k
 * 2、如果这个质数恰好等于n，说明结束，打印即可
 * 3、若不等于，则n=n/k，继续步骤2
 *
 * */
public class IntSplit {
    public static void main(String[] args) {
        System.out.println("请输入一个你要分解的正整数：");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.print(input + "=");

        for (int i=2;i<input+1;i++){

            while(input%i==0 && input!=i) {
                input = input/i;
                System.out.print(i+"*");
            }
            //上面的都不可以整除，说明这是个素数
            if (input==i) {
                System.out.print(i);
                break;
            }
        }
        scanner.close();
    }

}
