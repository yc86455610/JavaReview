package cn.yc.simplePractice;


import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？
 * <p>
 * 闰年的条件：year除以400能整除，或者year除以4能整除，但是不能是100的倍数
 */
public class TestDays {
    public static void main(String[] args) {
        System.out.println("请输入年月日(用空格隔开)：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int count = 0;  //天数总和
//        System.out.printf("%d %d %d", year, month, day);

        //创建一个包含月份的数组，默认是非闰年，如果是闰年，则在并且在三月以后再加1
        int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        count += day;
        for (int i = 1; i < month; i++) {
            count += monthArr[i];
        }
        if (isRight(year) && (month > 2)) {
            count += 1;
        }
        System.out.printf("这是%d年的第%d天", year, count);
    }

    //判断闰年
    private static boolean isRight(int n) {
        if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0)) {
            return true;
        }
        return false;
    }
}
