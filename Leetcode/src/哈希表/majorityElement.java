import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.Arrays;
import java.util.HashMap;

public class majorityElement {
    /**
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * <p>
     * 你可以假设数组是非空的，并且给定的数组总是存在众数。
     */

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1, 1, 1, 2, 2};
        int[] nums2 = {3, 2, 3};
        solution_majority solution_majority = new solution_majority();
        System.out.println(solution_majority.majorityElement_1(nums1));
        System.out.println(solution_majority.majorityElement_2(nums2));
    }
}

class solution_majority {
    public int majorityElement_1(int[] nums) {
        //hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    public int majorityElement_2(int[] nums) {
        //排序
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement_3(int[] nums) {
        //
        return 0;
    }
}
