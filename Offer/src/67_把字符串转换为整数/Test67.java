/**
 * 将一个字符串转换成一个整数，字符串不是一个合法的数值则返回 0，要求不能使用字符串转换整数的库函数。
 * <p>
 * Iuput:
 * +2147483647
 * 1a33
 * <p>
 * Output:
 * 2147483647
 * 0
 */

class Test67 {
    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
        System.out.println(solution67.StrToInt("+2147483647"));
        System.out.println(solution67.StrToInt("hhhla33"));

    }
}

class Solution67 {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;

        //判断是否是负数
        boolean isNegative = str.charAt(0) == '-';
        int ret = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //判断符号
            if (i == 0 && (c == '+' || c == '-'))
                continue;
            //判断是否有非法输入
            if (c < '0' || c > '9')
                return 0;
            ret = ret * 10 + (c - '0');
        }
        return isNegative ? -ret : ret;
    }
}