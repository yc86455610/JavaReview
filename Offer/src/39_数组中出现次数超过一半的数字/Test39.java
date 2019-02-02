import java.util.Arrays;

/**
 *排序后用当前元素和最中间的元素比较，若出现次数超过一半，那么该元素一定会占据最中间的位置
 *
 */

class Test39 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(solution39.MoreThanHalfNum_Solution(array));
    }
}

class Solution39 {
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int count = 0;
        int n = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[n / 2]) {
                count++;
            }
        }

        if (count > n / 2) {
            return array[n / 2];
        } else {
            return 0;
        }
    }
}