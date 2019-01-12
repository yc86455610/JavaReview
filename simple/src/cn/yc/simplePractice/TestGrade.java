package cn.yc.simplePractice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 用嵌套运算符打印学习成绩
 */
public class TestGrade {
    public static void main(String[] args) {
        System.out.println("打印你的成绩：");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        String belong = grade >= 90 ? "A" : (grade >= 75 ? "B" :
                (grade >= 60 ? "C" : "D"));
        System.out.println(grade + "分属于" + belong);
        scanner.close();
    }
}
