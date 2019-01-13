package cn.yc.simplePractice;


/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 1、2、3、4,....共n个数字
 */
public class Digital1234 {
    public static void main(String[] args) {
        digital(4);
    }

    //digital方法
    private static void digital(int n) {
        int sum = 0;
        for (int bite = 1; bite < n + 1; bite++) {
            for (int ten = 1; ten < n + 1; ten++) {
                for (int hundred = 1; hundred < n + 1; hundred++) {
                    if (bite != ten && ten != hundred && hundred != bite) {
                        System.out.print(100 * hundred + 10 * ten + bite + "    ");
                        sum++;
                        if (sum % 5 == 0) {
                            System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println("\n总共有" + sum + "个这样的三位数");

    }

}
