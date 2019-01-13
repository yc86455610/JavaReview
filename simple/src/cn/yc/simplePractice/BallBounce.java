<<<<<<< HEAD
package cn.yc.simplePractice;


import java.util.Scanner;

/**
 * 一球从h米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
 */
public class BallBounce {
    public static void main(String[] args) {
        System.out.println("请输入小球初始高度和落地次数：");
        Scanner scanner = new Scanner(System.in);
//        float h = 100, b = 3;
        float h = scanner.nextFloat();
        float n = scanner.nextFloat();
        float sum = h;//第一次落地sum=h
        h /= 2;

        for (int i = 2; i <= n; i++) {
            sum += h * 2;
            h /= 2;
        }

        System.out.println("在第" + (int) n + "次落地时，共经过" + sum + "米;\n第"
                + (int) n + "次反弹高度为" + h + "米");

        scanner.close();
    }
}
=======
package cn.yc.simplePractice;

import java.util.Scanner;

/**
 * 一球从h米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在第n次落地时，共经过多少米？第n次反弹多高？
 */

public class BallBounce {
    public static void main(String[] args) {
        System.out.println("请输入小球下落的高度和落地的次数：");
        Scanner scanner = new Scanner(System.in);
//        float h = 100; n = 3;
        float h = scanner.nextFloat();    //初始高度
        float n = scanner.nextFloat();    //落地次数
        float sum = h;      //第1次落地sum
        h /= 2;             //第一次落地反弹的h
        for (int i = 2; i <= n; i++) {
            sum += h * 2;
            h /= 2;   //第n次反弹的高度
        }
        System.out.println("在" + 100 + "米高度自由落下，经过" + (int) n + "次后，能反弹: " + h + "米\n经过的距离: " + sum + "米");
        scanner.close();
    }
}
>>>>>>> 30405c8bd2bd0ee42579c2292845c0d30fd7317e
