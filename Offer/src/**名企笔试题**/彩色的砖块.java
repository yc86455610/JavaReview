import java.util.HashSet;
import java.util.Scanner;

/**
 * 例如: s = "ABAB",那么小易有六种排列的结果:
 * "AABB","ABAB","ABBA","BAAB","BABA","BBAA"
 * 其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。
 */
public class 彩色的砖块 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //用hashset记录有几种字符
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hashSet.add(str.substring(i, i + 1));
            //一旦字符种类超过2，输出0
            if (hashSet.size() > 2) {
                System.out.println(0);
                return;
            }
        }

        //种类是2，输出2；种类是1，输出1
        System.out.println(hashSet.size());
    }
}