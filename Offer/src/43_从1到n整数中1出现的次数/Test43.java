/**
 * 从 1 到 n 整数中 1 出现的次数
 */

class Test43 {
    public static void main(String[] args) {
        Solution43 solution43 = new Solution43();
        System.out.println(solution43.NumberOf1Between1AndN_Solution(100));

    }
}

class Solution43 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m, b = n % m;
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }

        return cnt;
    }
}