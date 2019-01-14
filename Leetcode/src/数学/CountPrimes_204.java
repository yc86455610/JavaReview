package 数学;


import java.sql.SQLOutput;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * count 质数
 * 埃拉托斯特尼筛法在每次找到一个素数时，将能被素数整除的数排除掉。
 */
public class CountPrimes_204 {
    public static void main(String[] args) {
        Solution_204 solution = new Solution_204();

        System.out.println(solution.countPrimes(10));
    }

}


class Solution_204 {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrimes[i]) {
                continue;
            }

            count++;
            // 从 i * i 开始，因为如果 k < i，那么 k * i 在之前就已经被去除过了
            for (int j = i * i; j < n; j += i) {
                notPrimes[j] = true;   //都是合数（非素数）
            }
        }

        return count;
    }
}


