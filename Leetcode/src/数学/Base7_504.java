package 数学;

import java.sql.SQLOutput;

/**
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 */

public class Base7_504 {
    public static void main(String[] args) {
        Solution_504 solution = new Solution_504();

        System.out.println(solution.convertToBase7(100));
    }


}


class Solution_504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num;
        }
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        String ret = sb.reverse().toString();
        return isNegative ? "-" + ret : ret;
    }
}