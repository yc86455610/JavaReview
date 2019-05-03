package 字符串和数组;

//例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
public class LeftRotateString {
    public static void main(String[] args) {
        String str = "abcXYZdef";
        solution_LeftRotateString solution_leftRotateString = new solution_LeftRotateString();
        System.out.println(solution_leftRotateString.LeftRotateString(str, 3));
    }
}

class solution_LeftRotateString {
    public String LeftRotateString(String str, int n) {
        //左移n位
        int length = str.length();
        if (length == 0)
            return "";
        n = n % length;
        String str1 = str.substring(n, length);
        String str2 = str.substring(0, n);
        return str1 + str2;
    }
}