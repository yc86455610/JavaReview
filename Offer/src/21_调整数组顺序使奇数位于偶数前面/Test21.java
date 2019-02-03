import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
class Test21 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 6, 8};
        Solution21 solution21 = new Solution21();
        solution21.reOrderArray(nums);

        System.out.println(Arrays.toString(nums));
    }
}

class Solution21 {
    public void reOrderArray(int[] nums) {
        //求奇数个数
        int oddNum = 0;
        for (int val : nums) {
            if (val % 2 == 1)
                oddNum++;
        }

        int[] copy = nums.clone();
        int i = 0, j = oddNum;
        for (int num : copy) {
            if (num % 2 == 1)
                nums[i++] = num;
            else
                nums[j++] = num;
        }
    }
}