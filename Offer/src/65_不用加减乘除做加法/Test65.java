/**
 * 写一个函数，求两个整数之和，要求不得使用 +、-、*、/ 四则运算符号。
 */
class Test65 {
    public static void main(String[] args) {
        Solution65 solution65 = new Solution65();
        System.out.println(solution65.add(3, 4));
    }
}

class Solution65 {
    public int add(int a, int b) {
        return b == 0 ? a : add(a ^ b, (a & b) << 1);
    }
}