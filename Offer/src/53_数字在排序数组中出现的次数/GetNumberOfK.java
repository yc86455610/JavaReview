
public class GetNumberOfK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 3, 3, 4, 6};
        int K = 3;
        Solution_53 solution_53 = new Solution_53();
        System.out.println(solution_53.GetNumberOfK(nums, K));
    }
}

class Solution_53 {
    public int GetNumberOfK(int[] nums, int k) {
        int first = binarySearch(nums, k);
        int last = binarySearch(nums, k + 1);
        return (first == nums.length || nums[first] != k) ? 0 : last - first;
    }

    private int binarySearch(int[] nums, int k) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= k)
                h = m;
            else
                l = m + 1;
        }
        return l;
    }
}