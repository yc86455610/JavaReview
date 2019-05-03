/**
 * 0，1,...,n-1 这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈中删除第m个数字。
 * 求这个圆圈中省下的最后一个数字。
 * <p>
 * 用循环链表进行模拟操作，但时间复杂度o(mn)，空间复杂度o(n)
 * <p>
 * 这是经典的约瑟夫环问题
 */

class Test62 {
    public static void main(String[] args) {
        int n = 5, m = 3;
        Solution62 solution62 = new Solution62();
        System.out.println(solution62.LastRemaining_solution(n, m));
    }
}

class Solution62 {
    public int LastRemaining_solution(int n, int m) {
        if (n == 0)
            return -1;
        if (n == 1)
            return 0;
        //圆圈长度为 n 的解可以看做长度为 n-1 的解再加上报数的长度 m。
        //因为是圆圈，最好需要对 n 取余。
        return (LastRemaining_solution(n - 1, m) + m) % n;
    }
}