import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class two_Sum {
    //两数之和
    public static void main(String[] args) {
        solution_twoSum solution_twoSum = new solution_twoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution_twoSum.twoSum(nums, target)));
    }
}

class solution_twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}