package 双指针;

import java.util.Arrays;

/**
 * 双指针主要用于遍历数组，两个指针指向不同的元素，从而协同完成任务。
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p>
 * 如果两个指针指向元素的和 sum == target，那么得到要求的结果；
 * 如果 sum > target，移动较大的元素，使 sum 变小一些；
 * 如果 sum < target，移动较小的元素，使 sum 变大一些。
 */
public class TwoSum_167 {
    public static void main(String[] args) {
        int[] num1 = {2, 7, 11, 15};
        int target = 9;
        Solution_167 solution = new Solution_167();
        System.out.println(Arrays.toString(solution.twoSum(num1, target)));
    }
}

class Solution_167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
