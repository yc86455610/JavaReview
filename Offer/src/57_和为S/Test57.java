import org.w3c.dom.ls.LSInput;

import javax.swing.text.html.HTML;
import java.awt.*;
import java.lang.invoke.CallSite;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Arrays;

/**
 * 输入一个递增排序的数组和一个数字 S，在数组中查找两个数，使得他们的和正好是 S。
 * 如果有多对数字的和等于 S，输出两个数的乘积最小的。(双指针法可以保证输出的就是成乘积最小的)
 * <p>
 * "双指针"法
 * <p>
 * <p>
 * 输出所有和为 S 的连续正数序列。
 * 例如和为 100 的连续序列有：
 * [9, 10, 11, 12, 13, 14, 15, 16]
 * [18, 19, 20, 21, 22]。
 */

class Test57 {
    public static void main(String[] args) {
        Solution57 solution57 = new Solution57();
        int[] nums = {2, 3, 4, 5};
        int target = 9;
//        System.out.println(solution57.FindNumbersWithSum(nums, target));
        System.out.println(solution57.FindContinuousSequence(100));
    }
}

class Solution57 {
    public ArrayList<Integer> FindNumbersWithSum(int[] nums, int target) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target)
                return new ArrayList<>(Arrays.asList(nums[i], nums[j]));
            else if (sum < target)
                i++;
            else
                j--;
        }
        return new ArrayList<>();
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int start = 1, end = 2;
        int curSum = 3;
        while (end < sum) {
            if (curSum > sum) {
                curSum -= start;
                start++;
            } else if (curSum < sum) {
                end++;
                curSum += end;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    list.add(i);
                }
                ret.add(list);
                curSum -= start;
                start++;
                end++;
                curSum += end;
            }
        }
        return ret;
    }
}


