package 位运算;

/**
 * n & (n-1) 去除n级表示最低的那位
 * <p>
 * n % (-n) 得到n级表示最低的那位
 */
public class Test {
    public static void main(String[] args) {
        solution solution = new solution();
//        System.out.println(solution.hammingDistance(1, 4));
//        System.out.println(solution.hammingDistance1(3, 4));

        int[] nums = {4, 2, 2, 4, 3};
//        System.out.println(solution.singleNumber(nums));
//        System.out.println(solution.isPowerOfTwo(8));
//        System.out.println(solution.isPowerOfTwo1(16));

        System.out.println(solution.hasAlternatingBits(10));
        System.out.println(solution.hasAlternatingBits(11));
    }
}

class solution {
    /**
     * 461 统计两个数的二进制表示有多少位不同
     * 1 0001
     * 4 0100
     * <p>
     * 输出2，共有两位表示不同
     */

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while (z != 0) {
            z &= (z - 1);
            cnt++;
        }
        return cnt;
    }

    public int hammingDistance1(int x, int y) {
        //可以使用 Integer.bitcount() 来统计 1 个的个数
        return Integer.bitCount(x ^ y);
    }


    /**
     * 136  数组中唯一一个不重复的数字
     * Input: [4,1,2,1,2]
     * Output: 4
     */
    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        return ret;
    }

    /**
     * 231  判断一个数是不是 2 的 n 次方
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return Integer.bitCount(n) == 1;
    }

    public boolean isPowerOfTwo1(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    /**
     * 693 判断一个数的位级表示是否不会出现连续的 0 和 1
     * Input: 10
     * Output: True
     * Explanation:
     * The binary representation of 10 is: 1010.
     * <p>
     * Input: 11
     * Output: False
     * Explanation:
     * The binary representation of 11 is: 1011.
     */
    public boolean hasAlternatingBits(int n) {
        int a = (n ^ (n >> 1));
        return (a & (a + 1)) == 0;
    }
}
