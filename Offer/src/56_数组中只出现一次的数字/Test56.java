import jdk.swing.interop.SwingInterOpUtils;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次，找出这两个数。
 * <p>
 * 位运算
 * <p>
 * Input: [2,3,2,1,1,4]
 * Output:  4，3
 * <p>
 * 思路： 两个不相等的元素在位级表示上必定有一位存在不同，将数组
 * 的所有元素异或得到的结果为不存在重复的两个元素异或的结果。
 * <p>
 * 异或特征：
 * 1、所有数和0异或都是本身
 * 2、相同的两个数异或结果为0
 * 本例中将数组所有元素异或，有重复的元素异或后得0，最后得到的结果是不重复的元素异或后的结果！
 *
 * diff &= -diff 得到出 diff 最右侧不为 0 的位，
 * 也就是不存在重复的两个元素在位级表示上最右侧不同的那一位，
 * 利用这一位就可以将两个元素区分开来。
 *
 */

class Test56 {
    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();
        int[] nums = {1, 2, 1, 3, 2, 4};
        //num1, num2 长度为1的数组，num1[0], num2[0]设置为返回结果
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        solution56.FindNumsAppearOnce(nums, num1, num2);
        System.out.printf("%d   %d", num1[0], num2[0]);
    }
}

class Solution56 {
    //num1, num2 分别为长度为1的数组，传出参数
    //将num1[0], num2[0]设置为返回结果
    public void FindNumsAppearOnce(int[] nums, int[] num1, int[] num2) {
        int diff = 0;
        for (int num : nums)
            diff ^= num;
//        System.out.println(diff);

//        负数以原码的补码形式表达
//        要得到补码，先得到反码，再加1
        diff &= -diff;

//        System.out.println(diff);

//        int a = 5;
//        a &= -a;
//        System.out.println(a);

        for (int num : nums) {
            if ((num & diff) == 0)
                num1[0] ^= num;
            else
                num2[0] ^= num;
        }
    }
}