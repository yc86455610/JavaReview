package 数学;

import java.sql.SQLOutput;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 说明：不要使用任何内置的库函数，如  sqrt。
 */

public class ValidPerfectSquare_367 {

    public static void main(String[] args) {
        Solution_367 solution_367 = new Solution_367();
        System.out.println(solution_367.isPerfectSquare(16));
        System.out.println(solution_367.isPerfectSquare(15));
    }
}

class Solution_367 {
    public boolean isPerfectSquare(int num) {
        int subNum = 1;
        while (num > 0) {
            num -= subNum;
            subNum += 2;
        }

        return num == 0;
    }
}