import jdk.swing.interop.SwingInterOpUtils;

import java.sql.ResultSet;

/**
 * 10.1 斐波那契数列, 求斐波那契数列的第 n 项，n <= 39。
 * 递归的问题： 会重复计算一些子问题，动态规划把子问题的解缓存起来，避免求解子问题
 * <p>
 * 10.2 青蛙跳台阶
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * <p>
 * 10.3 矩形覆盖
 * 2*1 的小矩形横着或者竖着去覆盖更大的矩形,请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，
 * 总共有多少种方法？
 * <p>
 * 10.4 变态跳台阶一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */

class Test10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
//        System.out.println(solution10.Fibonacci_1(4));
//        System.out.println(solution10.Fibonacci(4));
//        System.out.println(solution10.JumpFloor(4));
        System.out.println(solution10.RectCover(4));

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

    public int JumpFloor(int n) {
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2;
        int result = 1;
        for (int i = 3; i <= n; i++) {
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }

    public int RectCover(int n) {
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result =pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }

    public int JumpFloorII(int target){

    }

}
