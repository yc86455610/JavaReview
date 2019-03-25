import java.rmi.MarshalException;

/**
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 * <p>
 * Consider the following matrix:
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * <p>
 * Given target = 5, return true.
 * Given target = 20, return false.
 * <p>
 * 要求时间复杂度 O(M + N)，空间复杂度 O(1)。
 * <p>
 * 也属于双指针问题
 */

class Test04 {
    public static void main(String[] args) {
        Solution04 solution04 = new Solution04();
        int target = 1;
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(solution04.find(target, matrix));
    }
}

class Solution04 {
    public boolean find(int target, int[][] matrix) {
        //矩阵为空、行数为0、列数为0
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;

        //从右上角开始遍历
        //也可以从左下角开始遍历
        int r = rows - 1, c = 0;
        while (r >= 0 && c <= matrix[0].length - 1) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target < matrix[r][c]) {
                r--;
            } else {
                c++;
            }
        }

        return false;
    }
}