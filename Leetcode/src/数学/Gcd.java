package 数学;

/**
 * 1、传统求最大公约数和最小公倍数
 * 2、使用位操作和减法求解最大公约数
 */

public class Gcd {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.gcd(12, 8));
        System.out.println(solution.lcm(12, 8));
    }


}


class Solution {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //最小公倍数为两数的乘积除以最大公约数。
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
