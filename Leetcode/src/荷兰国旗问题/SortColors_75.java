package 荷兰国旗问题;


import javax.xml.transform.SourceLocator;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * 三路快排
 * <p>
 * 荷兰国旗包含三种颜色：红、白、蓝。
 * <p>
 * 有三种颜色的球，算法的目标是将这三种球按颜色顺序正确地排列。
 * <p>
 * 它其实是三向切分快速排序的一种变种，在三向切分快速排序中，
 * 每次切分都将数组分成三个区间：小于切分元素、等于切分元素、大于切分元素，
 * 而该算法是将数组分成三个区间：等于红色、等于白色、等于蓝色。
 * <p>
 * <p>
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
public class                                                                                                                                                                                                               SortColors_75 {
    public static void main(String[] args) {
        Solution_75 solution = new Solution_75();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

}


class Solution_75 {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1;
        int i = 0;
        while (i <= high) {
            if (nums[i] == 0) {
                swap(nums, i, low);
                ++low;
                ++i;
            }else if (nums[i] == 1) {
                ++i ;
            }else {
                swap(nums, i, high);
                --high;
            }
        }
    }

    //交换位置是i和j的元素
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}