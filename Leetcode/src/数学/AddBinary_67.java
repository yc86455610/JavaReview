package 数学;

import java.sql.SQLOutput;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */


public class AddBinary_67 {

    public static void main(String[] args) {
        Solution_67 solution_67 = new Solution_67();
        System.out.println(solution_67.addBinary("11", "1"));
    }


}

class Solution_67 {
    public String addBinary(String a, String b) {

        //carry表示当前位
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder str = new StringBuilder();
        while (carry == 1 || i >= 0 || j >= 0) {
            if (i >= 0 && a.charAt(i--) == '1') {
                carry++;
            }
            if (j >= 0 && b.charAt(j--) == '1') {
                carry++;
            }
            str.append(carry % 2);   //1+1逢二进一
            carry /= 2;
        }
        return str.reverse().toString();

    }
}