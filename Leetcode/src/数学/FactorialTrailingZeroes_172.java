package 数学;

/**
 * 统计阶乘尾部有多少个 0
 * 尾部的 0 由 2 * 5 得来，
 * 2 的数量明显多于 5 的数量，因此只要统计有多少个 5 即可。
 */

public class FactorialTrailingZeroes_172 {
    public static void main(String[] args) {
        Solution_172 solution_172 = new Solution_172();
        System.out.println(solution_172.trailingZeroes(102));
    }

}

class Solution_172 {

    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}