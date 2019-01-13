package cn.yc.simplePractice;

/**
 * 计算101-200以内素数的个数,并输出,每行打印5个
 */
public class CalPrime {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 200; i++) {
            if (isRightNum(i)) {
                System.out.print(i + "  ");
                sum++;
                if (sum % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n素数的个数是：" + sum);
    }

    //判断是否为素数
    private static boolean isRightNum(int i) {
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}

