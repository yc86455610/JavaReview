import java.util.LinkedList;

public class maxSlidingWindow {
    //返回滑动窗口的最大值

    /**
     * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
     * 输出: [3,3,5,5,6,7]
     * 解释:
     * <p>
     * 滑动窗口的位置                最大值
     * ---------------               -----
     * [1  3  -1] -3  5  3  6  7       3
     * 1 [3  -1  -3] 5  3  6  7       3
     * 1  3 [-1  -3  5] 3  6  7       5
     * 1  3  -1 [-3  5  3] 6  7       5
     * 1  3  -1  -3 [5  3  6] 7       6
     * 1  3  -1  -3  5 [3  6  7]      7
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2)
            return nums;
        //双向队列，保存当前窗口最大值的数组位置，保证队列中数组位置的数按从大到小排列
        LinkedList<Integer> list = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            //保证从大到小，如果前面数小，弹出
            while (!list.isEmpty() && nums[list.peekLast()] <= nums[i]) {
                list.pollLast();
            }
            //添加当前值对应的数组下标
            list.addLast(i);
            //初始化窗口，等到窗口长度为k，下次移动再删除过期数值
            if (list.peek() <= i - k) {
                list.poll();
            }
            //窗口长度为k，在保存当前窗口中的最大值
            if (i - k + 1 >= 0)
                result[i - k + 1] = nums[list.peek()];
        }
        return result;
    }
}
