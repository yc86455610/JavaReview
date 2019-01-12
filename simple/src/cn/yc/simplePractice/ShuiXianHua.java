package cn.yc.simplePractice;

/**
 * 打印100-1000所有的水仙花数
 */
public class ShuiXianHua {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 1000; i++) {
            int bite = i % 10;
            int ten = i / 10 % 10;
            int hundred = i / 100;
            if (i == (Math.pow(bite, 3) + Math.pow(ten, 3) + Math.pow(hundred, 3))) {
                System.out.println(i + "  ");
                sum++;
            }
        }
        System.out.println("水仙花个数总数是:" + sum);
    }

}
