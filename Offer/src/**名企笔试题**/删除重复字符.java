import java.util.HashSet;
import java.util.Scanner;

public class 删除重复字符 {
    /**
     * 对于同一个字母,他只想保留第一次出现并删除掉后面出现的字母。
     * banana
     * ban
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String res = "";
//        int flag = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int temp = 1 << (s.charAt(i) - 'a');
//            if ((temp & flag) == 0) { //第一次出现
//                res += s.charAt(i);
//                flag |= temp;
//            }
//        }
//        System.out.println(res);

        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashSet.add(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
