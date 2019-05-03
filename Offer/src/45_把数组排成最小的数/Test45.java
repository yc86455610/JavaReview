import java.util.Arrays;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组 {3，32，321}，则打印出这三个数字能排成的最小数字为 321323。
 * <p>
 * 排序问题
 */

class Test45 {
    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();
        int[] numbers = {3, 32, 321};
        int[] numbers1 = {2, 34, 9};
//        System.out.println(solution45.PrintMinNumber(numbers));
        System.out.println(solution45.PrintMinNumber(numbers1));
    }
}

class Solution45 {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";
        //将数字都转为字符串比较
        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = numbers[i] + "";
        }

        //排序得出最小数字
        Arrays.sort(nums, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        String ret = "";
        for (int i = 0; i < nums.length; i++) {
            ret += nums[i];
        }
        return ret;
    }
}