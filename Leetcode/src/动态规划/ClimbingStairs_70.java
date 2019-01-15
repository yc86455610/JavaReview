package 动态规划;

import java.sql.SQLOutput;

/**
 * 递归和动态规划都是将原问题拆成多个子问题然后求解，
 * 他们之间最本质的区别是，动态规划保存了子问题的解，避免重复计算。
 * <p>
 * <p>
 * <p>
 * 题目描述：有 N 阶楼梯，每次可以上一阶或者两阶，求有多少种上楼梯的方法。
 * <p>
 * 考虑到 dp[i] 只与 dp[i - 1] 和 dp[i - 2] 有关，因此可以只用两个变量来存储 dp[i - 1] 和 dp[i - 2]，
 * 使得原来的 O(N) 空间复杂度优化为 O(1) 复杂度。
 */

public class ClimbingStairs_70 {

    public static void main(String[] args) {
        Solution_70 solution = new Solution_70();

        System.out.println(solution.climbStairs(5));
    }

}

class Solution_70 {
    public int climbStairs01(int n) {
        if(n==1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int climbStairs(int n ){
        int prev = 0;
        int cur = 1;
        for(int i=1;i<=n;i++){
            int temp = cur;
            cur += prev;
            prev = temp;
        }
        return cur;
    }
}
