import java.util.Arrays;

/**
 * 五张牌，其中大小鬼为癞子，牌面大小为 0。判断这五张牌是否能组成顺子。
 */

class Test61 {
    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();
        int[] nums1 = {0, 3, 4, 5, 6};
        int[] nums2 = {2, 4, 6, 7, 8};
        System.out.println(solution61.isContinuous(nums1));
        System.out.println(solution61.isContinuous(nums2));
    }
}

class Solution61 {
    public boolean isContinuous(int[] nums) {
        //统计0的个数
        if (nums.length != 5 || nums == null)
            return false;

        //给数组排序
        Arrays.sort(nums);

        int cnt = 0;
        for (int num : nums) {
            if (num == 0)
                cnt++;
        }

        //使用癞子补全不连续的顺子
        for (int i = cnt; i < nums.length - 1; i++) {
            //不能有重复数字
            if (nums[i + 1] == nums[i])
                return false;
            cnt -= nums[i + 1] - nums[i] - 1;
        }
        return cnt >= 0;
    }
}