package 字符串和数组;

import java.util.Scanner;

/**
 * 字符串的旋转
 * <p>
 * <p>
 * 给定两字符串A和B，如果能将A从中间某个位置分割为左右两部分字符串（都不为空串），并将左边的字符串移动到右边字符串后面组成新的字符串可以变为字符串B时返回true。
 * 例如：如果A=‘youzan’，B=‘zanyou’，A按‘you’‘zan’切割换位后得到‘zanyou’和B相同返回true。
 * <p>
 * 2个不为空的字符串(说明:输入一个字符串以英文分号";"分割为2个字符串)
 * 例如:youzan;zanyou 即为A=‘youzan’，B=‘zanyou’
 */
public class reverseString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] s = str.split(";");
        if (s[0].length() != s[1].length()) {
            System.out.println(false);
            return;
        }
        s[0] = s[0] + s[0];
        System.out.println(s[0].contains(s[1]));
    }
}
