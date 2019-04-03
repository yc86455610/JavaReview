

/**
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * <p>
 * Input:
 * {2, 3, 1, 0, 2, 5}
 * <p>
 * Output:
 * 2
 * <p>
 * 将值为 i 的元素调整到第 i 个位置上进行求解。
 */


class Test03 {
    public static void main(String[] args) {
        Solution03 solution = new Solution03();
        int[] nums = {2, 3, 1, 0, 2, 5};
        int length = 6;
        int[] duplication = new int[length];
//        System.out.println(solution.duplicate(nums, length, duplication));

//        System.out.println("####################");
        int[] nums1 = {2, 3, 5, 4, 3, 2, 6, 7};
        int length1 = 8;
        System.out.println(solution.getDuplicate(nums1, length1));

    }
}

class Solution03 {
    //将值为i的元素调整到第i个位置上
    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    //不修改数组找出重复的数字
    public int getDuplicate(int[] nums, int length) {
        if (nums == null || length <= 0) return -1;
        int low = 1;
        int high = length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int count = countRange(nums, length, low, middle);
            if (high == low) {
                if (count > 1) return low;
                else break;
            }
            if (count > (middle - low + 1)) high = middle;
            else low = middle + 1;
        }
        return -1;
    }

    private int countRange(int[] nums, int length, int low, int high) {
        if (nums == null) return 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] >= low && nums[i] <= high) count++;
        }
        return count;
    }
}