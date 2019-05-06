import java.util.ArrayList;

/**
 * 矩阵顺时针打印结果为：1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10
 * <p>
 * 双指针法
 */

class Test29 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(solution29.printMatrix(matrix));
    }
}

class Solution29 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;

        while (r1 <= r2 && c1 <= c2) {
            //遍历第一行
            for (int i = c1; i <= c2; i++)
                ret.add(matrix[r1][i]);
            //添加8，12，16
            for (int i = r1 + 1; i <= r2; i++)
                ret.add(matrix[i][c2]);

            if (r1 != r2) {
                for (int i = c2 - 1; i >= c1; i--) {
                    ret.add(matrix[r2][i]);
                }
            }
            if (c1 != c2) {
                for (int i = r2 - 1; i > r1; i--) {
                    ret.add(matrix[i][c1]);
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;

        }
        return ret;
    }
}