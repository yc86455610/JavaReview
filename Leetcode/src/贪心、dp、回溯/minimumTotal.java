import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumTotal {
    //三角形最小路径和

    /**
     * [
     * [2],
     * [3,4],
     * [6,5,7],
     * [4,1,8,3]
     * ]
     * <p>
     * <p>
     * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
     */
    public static void main(String[] args) {
        solution_triangle solution_triangle = new solution_triangle();

        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> list1 = Arrays.asList(2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(6, 5, 7);
        List<Integer> list4 = Arrays.asList(4, 1, 8, 3);

        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);

        System.out.println(solution_triangle.minimumTotal_2(triangle));
        System.out.println(solution_triangle.minimumTotal_3(triangle));
    }
}

class solution_triangle {
    public int minimumTotal_1(List<List<Integer>> triangle) {
        //递归，回溯 o(2的n次方)
        return 0;
    }

    public int minimumTotal_2(List<List<Integer>> triangle) {
        //动态规划，二维数组
        if (triangle == null || triangle.size() == 0)
            return 0;
        int[][] dp = new int[triangle.size() + 1][triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> curTr = triangle.get(i);
            for (int j = 0; j < curTr.size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + curTr.get(j);
            }
        }

        return dp[0][0];
    }

    public int minimumTotal_3(List<List<Integer>> triangle) {
        //动态规划
        if (triangle == null || triangle.size() == 0)
            return 0;
        //只需记录每一层的最小值即可
        int[] dp = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> curTr = triangle.get(i);
            for (int j = 0; j < curTr.size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + curTr.get(j);
            }
        }

//        for (int k : dp) {
//            System.out.println(k);
//        }

        return dp[0];
    }
}
