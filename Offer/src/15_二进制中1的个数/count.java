public class count {
    //二进制中1的个数
    //n和n-1&位运算 可以把n最右边的1变成0    有多少个1就做多少次与运算
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.NumberOf1(7));
    }
}

class Solution15 {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
        return cnt;
    }
}