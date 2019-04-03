import java.awt.font.NumericShaper;
import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        Solution_40 solution_40 = new Solution_40();
        System.out.println(solution_40.GetLeastNumbers_Solution(nums, k));
    }
}

class Solution_40 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (nums == null || nums.length == 0) return null;
        findKthSmallest(nums, k - 1);
        for (int i = 0; i < k; i++) {
            ret.add(nums[i]);
        }
        return ret;
    }

    public void findKthSmallest(int[] nums, int k) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k) break;
            if (j > k) h = j - 1;
            else l = j + 1;
        }
    }

    //返回的正好是第k大的数
    private int partition(int[] nums, int l, int h) {
        int p = nums[l];
        int i = l, j = h + 1;
        while (true) {
            while (i != h && nums[++i] < p) ;
            while (j != l && nums[--j] > p) ;
            if (i >= j) break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
