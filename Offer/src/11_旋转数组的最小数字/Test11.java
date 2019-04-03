import java.util.Spliterator;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * <p>
 * 例如数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小值为 1。
 */

class Test11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int[] nums1 = {3, 4, 5, 6, 1, 2};
        int[] nums2 = {1, 1, 1, 0, 1};
        System.out.println(solution11.FindSmallestNumberOfReverseNums(nums1));
        System.out.println(solution11.FindSmallestNumberOfReverseNums(nums2));
    }
}

class Solution11 {
    public int FindSmallestNumberOfReverseNums(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[l] == nums[m] && nums[m] == nums[h])
                return minNuber(nums, l, h);
            else if (nums[m] <= nums[h]) h = m;
            else l = m + 1;
        }
        return nums[l];
    }

    private int minNuber(int[] nums, int l, int h) {
        for (int i = l; i < h; i++) {
            if (nums[i + 1] < nums[i])
                return nums[i + 1];
        }
        return nums[l];
    }
}