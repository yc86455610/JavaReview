import java.util.Arrays;

/**
 * 五张牌，其中大小鬼为癞子，牌面大小为 0。判断这五张牌是否能组成顺子。
 */

class Test61 {
    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();
        int[] nums = {0, 3, 4, 5, 6};
        System.out.println(solution61.isContinuous(nums));
    }
}

class Solution61 {
    public boolean isContinuous(int[] nums) {
        if (nums.length < 5) {
            return false;
        }

        Arrays.sort(nums);

        //先统计癞子(0)的数量
        int cnt = 0;
        for (int num : nums) {
            if (num == 0) {
                cnt++;
            }
        }

        //使用癞子补全不连续的顺子
        for (int i = cnt; i < nums.length - 1; i++) {
            //有重复的牌，直接返回false
            if (nums[i + 1] == nums[i])
                return false;
            cnt -= nums[i + 1] - nums[i] - 1;
        }

        return cnt >= 0;
    }
}