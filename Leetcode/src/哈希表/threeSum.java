
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threeSum {
    //三数之和
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        solution_threeSum solution_threeSum = new solution_threeSum();
        System.out.println(solution_threeSum.threeSum(nums));
    }
}

class solution_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ret = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (a > 0)
                break;
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                int c = 0 - a - b;
                if (set.contains(c)) {
                    ret.add(Arrays.asList(a, b, c));
                } else {
                    set.add(b);
                }
            }
        }
        return new ArrayList<>(ret);
    }
}