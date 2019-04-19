package 字符串和数组;

import java.util.Scanner;
import java.util.Stack;

public class reverseString {
    //1、倒置字符串。hello ==> olleh
    //2、将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I
    public static void main(String[] args) {
        solution_reverseString solution_reverseString = new solution_reverseString();
        String str = "I like beijing.";
//        System.out.println("字符串反转前: " + str);
//        System.out.println("字符串反转后: " + solution_reverseString.reverseString4(str));
        System.out.println(solution_reverseString.reverseString5(str));
    }
}

class solution_reverseString {
    private String reverseString1(String str) {
        //使用Java的反转函数reverse()
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse;
    }

    public String reverseString2(String str) {
        //将字符串转为char数组
        if (str == null || str.length() == 0) return str;
        char[] array = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(str.length() - i - 1);
        }
        return new String(array);
    }

    public String reverseString3(String str) {
        //利用栈的性质
        if (str == null || str.length() == 0) return str;
        Stack<Character> stack = new Stack<>();
        char[] array = str.toCharArray();
        for (Character c : array) {
            stack.push(c);
        }
        int len = str.length();
        for (int i = 0; i < len; i++) {
            array[i] = stack.pop();
        }
        return new String(array);
    }

    public String reverseString4(String str) {
        //逆序遍历
        if (str == null || str.length() == 0) return str;
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    //倒置字符串，不包括标点，逆序遍历
    public String reverseString5(String str) {
//        Scanner sc = new Scanner(System.in);
        if (str == null || str.length() == 0) return str;
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]).append(" ");
        }
        String res = sb.toString().trim();
        return res;
    }
}
