public class maxProduct {
    //leetcode 152,

    /**
     * 输入: [2,3,-2,4]
     * 输出: 6
     * 解释: 子数组 [2,3] 有最大乘积 6。
     * <p>
     * 输入: [-2,0,-1]
     * 输出: 0
     * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
     */

    public static void main(String[] args) {
        solution_maxProduct solution_maxProduct = new solution_maxProduct();
        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {2, 3, -10, 5, -1};
        System.out.println(solution_maxProduct.maxProduct(nums2));
    }
}

class solution_maxProduct {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }

            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }
}