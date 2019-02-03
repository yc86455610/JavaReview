import jdk.swing.interop.SwingInterOpUtils;

/**
 * 10.1 斐波那契数列, 求斐波那契数列的第 n 项，n <= 39。
 * 递归的问题： 会重复计算一些子问题，动态规划把子问题的解缓存起来，避免求解子问题
 * <p>
 * 10.2 青蛙跳台阶
 * <p>
 * 10.3 矩形覆盖
 * <p>
 * 10.4 变态跳台阶
 */

class Test10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
//        System.out.println(solution10.Fibonacci_1(4));
        System.out.println(solution10.Fibonacci(4));
    }
}

class Solution10 {
    //递归
    public int Fibonacci_1(int n) {
        if (n <= 1) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    //因第i项只与第i-1项和第i-2项有关，因此只需要存储前两项的值就能求解第i项数
    //从而将空间复杂度由 O(N) 降低为 O(1)。
    //动态规划
    public int Fibonacci(int n) {
        if (n <= 1)
            return n;
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
