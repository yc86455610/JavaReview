package 数学;

/**
 * 判断是否为3的幂
 */

public class PowerOfThree {
    public static void main(String[] args) {
        Solution_326 solution_326 = new Solution_326();
        System.out.println(solution_326.isPowerOfThree(27));
        System.out.println(solution_326.isPowerOfThree(26));
    }

}

class Solution_326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        int base = 3;
        while (n > 1) {
            if (n % base != 0) {
                return false;
            }
            n /= base;
        }
        return true;
    }

}