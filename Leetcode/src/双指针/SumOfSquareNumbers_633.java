package 双指针;

/**
 * 题目描述：判断一个数是否为两个数的平方和。
 * <p>
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 */

public class SumOfSquareNumbers_633 {

    public static void main(String[] args) {
        Solution_633 solution = new Solution_633();
        System.out.println(solution.judgeSquareSum(36));
    }

}


class Solution_633 {
    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int) Math.sqrt(c);
        //两个数可以相等,8 = 2*2+2*2
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c) {
                System.out.println(i + " " + j + " ");
                return true;
            } else if (powSum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}