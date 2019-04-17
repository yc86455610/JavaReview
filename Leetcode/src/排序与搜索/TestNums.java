import java.util.ArrayList;
import java.util.List;

public class TestNums {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        solution287 solution = new solution287();
//        System.out.println(solution.findDuplicate1(nums));

        int[] nums1 = {5, 2, 6, 1};
        System.out.println(solution.countSmaller(nums1));
    }
}

class solution287 {
    /**
     * 287  寻找重复数
     * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），
     * 可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
     * <p>
     * 输入: [1,3,4,2,2]
     * 输出: 2
     * <p>
     * 输入: [3,1,3,4,2]
     * 输出: 3
     * <p>
     * 不能更改原数组（假设数组是只读的）。
     * 只能使用额外的 O(1) 的空间。
     * 时间复杂度小于 O(n2) 。
     * 数组中只有一个重复的数字，但它可能不止重复出现一次。
     */

    public int findDuplicate1(int[] nums) {
        //二分查找
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int num : nums) {
                if (num <= mid)
                    cnt++;
            }
            if (cnt > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    /**
     * 315  计算右侧小于当前元素的个数
     * 输入: [5,2,6,1]
     * 输出: [2,1,1,0]
     * 解释:
     * 5 的右侧有 2 个更小的元素 (2 和 1).
     * 2 的右侧仅有 1 个更小的元素 (1).
     * 6 的右侧有 1 个更小的元素 (1).
     * 1 的右侧有 0 个更小的元素.
     */

    //暴力法
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return list;
        int cnt;
        for (int i = 0; i < nums.length - 1; i++) {
            cnt = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) cnt++;
            }
            list.add(cnt);
        }
        list.add(0);
        return list;
    }

    //二叉查找树
}