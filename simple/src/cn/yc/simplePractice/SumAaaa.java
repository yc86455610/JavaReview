package cn.yc.simplePractice;

import java.util.Scanner;

/**
 * 求s=a+aa+aaa+aaaa+aa...a的值
 * 输出结果的形式如：2+22+222=246
 * <p>
 * 1、第一项有一个a,最后一项有n个a
 * 2、第1和第2项相差2*10，第2和第三项相差2*100，第k和第k+1项相差2*(10的k次方)
 */
public class SumAaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a = scanner.nextInt();
        System.out.println("请输入n的值：");
        int n = scanner.nextInt();


        int[] arr = new int[n]; //创建数组长度为n
        int i = 1;  //while循环初始化的值
        arr[0] = a; //数组第一个元素是a

        //给数组的每一项赋值
        while (i < n) {
            a *= 10;
            arr[i] = arr[i - 1] + a;
            i++;
        }
        //求和
        int sum = 0;
        for (int s : arr) {
            sum += s;
            if (s == arr[n - 1]) {
                System.out.print(s);
                break;
            }
            System.out.print(s + "+");
        }
        System.out.print("=" + sum);
    }
}
