import java.awt.*;
import java.util.Arrays;

/**
 * 在一个 m*n 的棋盘的每一个格都放有一个礼物，每个礼物都有一定价值（大于 0）。
 * 从左上角开始拿礼物，每次向右或向下移动一格，直到右下角结束。
 * 给定一个棋盘，求拿到礼物的最大价值。例如，对于如下棋盘
 * <p>
 * 1    10   3    8
 * 12   2    9    6
 * 5    7    4    11
 * 3    7    16   5
 * 礼物的最大价值为 1+12+5+7+7+16+5=53。
 * <p>
 * 应该用动态规划求解，而不是深度优先搜索，
 * 深度优先搜索过于复杂，不是最优解。
 */

class Test47 {
    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int[][] values = {
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5},
        };

        System.out.println(solution47.getMost(values));
    }
}

class Solution47 {
    public int getMost(int[][] values) {
        //空、长度为0、宽度为0
        if (values == null || values.length == 0 || values[0].length == 0)
            return 0;

        int n = values[0].length;    //n是列数
        int[] dp = new int[n];

        for (int[] value : values) {
            //dp[i]可以理解为走完第i列的最大数
            dp[0] += value[0];

            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i], dp[i - 1]) + value[i];
            }

        }

        for (int j : dp) {
            System.out.println(j);
        }


        System.out.println("#####################");
        return dp[n - 1];
    }
}