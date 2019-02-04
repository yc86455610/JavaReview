import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * 把一根绳子剪成多段，并且使得每段的长度乘积最大。
 * <p>
 * n = 2
 * return 1 (2 = 1 + 1)
 * <p>
 * n = 10
 * return 36 (10 = 3 + 3 + 4)
 */


class Test14 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
//        System.out.println(solution14.integerBreak_1(10));
        System.out.println(solution14.integerBreak_2(10));
    }
}

class Solution14 {
    //贪心，尽可能多剪长度为3的生字，并且不允许有长度为1的绳子出现
    //如若出现，就从已经切好长度为3的绳子拿出一段长度为1的绳子重新组合，把他们切成两段长度为2的绳子
    public int integerBreak_1(int n) {
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int timesOf3 = n / 3;
        if (n - timesOf3 * 3 == 1)
            timesOf3--;
        int timesOf2 = (n - timesOf3 * 3) / 2;
        return (int) (Math.pow(3, timesOf3) * (int) (Math.pow(2, timesOf2)));
    }

    //动态规划
    public int integerBreak_2(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
            }
        }
        return dp[n];
    }
}