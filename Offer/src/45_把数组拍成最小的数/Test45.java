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
        int[] numbers = {3, 12, 5};
        System.out.println(solution45.PrintMinNumber(numbers));
    }
}

class Solution45 {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";
        int n = numbers.length;
        String[] nums = new String[n];

        //把numbers的整数变成字符串
        for (int i = 0; i < n; i++) {
            nums[i] = numbers[i] + "";
        }

        Arrays.sort(nums, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        String ret = "";
        for (String str : nums)
            ret += str;
        return ret;
    }
}