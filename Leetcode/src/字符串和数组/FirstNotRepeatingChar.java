package 字符串和数组;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Scanner;

//字符串中第一个只出现一次出现的字符,返回他的位置
public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        solution_firstNot solution_firstNot = new solution_firstNot();
        String str = "bcbadcb";
        System.out.println(solution_firstNot.FirstNotRepeatingChar1(str));
        System.out.println(solution_firstNot.FirstNotRepeatingChar2(str));
    }
}

class solution_firstNot {
    //数组代替hash表
    public int FirstNotRepeatingChar1(String str) {
        int length = str.length();
        int[] cnts = new int[256];
        for (int i = 0; i < length; i++) {
            cnts[str.charAt(i)]++;
        }
        for (int i = 0; i < length; i++) {
            if (cnts[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    //hash表
    public int FirstNotRepeatingChar2(String str) {
        int length = str.length();
        if (str == null || length == 0)
            return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(str.charAt(i))) {
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i), value + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < length; i++) {
            if (map.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}


