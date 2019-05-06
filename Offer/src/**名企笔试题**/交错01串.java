import java.util.Scanner;

public class 交错01串 {
    /**
     * 输入：111101111
     * 输出：3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            int len = 1;
            int maxLen = 1;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i - 1) != str.charAt(i)) {
                    len++;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                } else {
                    len = 1;
                }
            }
            System.out.println(maxLen);
        }
    }
}
