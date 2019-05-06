/**
 * {6, -3, -2, 7, -15, 1, 2, 2}，
 * 连续子数组的最大和为 8（从第 0 个开始，到第 3 个为止）。
 * <p>
 * 数字中会包含负数
 */

class Test42 {
    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();
        int[] nums = {6, -3, -2, 7, -15, 1, 2, 2};
        System.out.println(solution42.FindGreatestSumOfSubArray(nums));
    }
}

class Solution42 {
    public int FindGreatestSumOfSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int greatestSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum = sum <= 0 ? num : sum + num;
            greatestSum = Math.max(sum, greatestSum);
        }
        return greatestSum;
    }
}