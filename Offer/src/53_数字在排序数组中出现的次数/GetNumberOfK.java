
public class GetNumberOfK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 3, 4, 6};
        int K = 3;
        Solution_53 solution_53 = new Solution_53();
        System.out.println(solution_53.GetNumberOfK(nums, K));
    }
}

class Solution_53 {
    public int GetNumberOfK(int[] nums, int K) {
        int first = binarySearch(nums, K);
        int last = binarySearch(nums, K + 1);
        return (first == nums.length || nums[first] != K) ? 0 : last - first;
    }

    private int binarySearch(int[] nums, int K) {
        int l = 0, h = nums.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= K)
                h = m;
            else
                l = m + 1;
        }
        return l;
    }
}