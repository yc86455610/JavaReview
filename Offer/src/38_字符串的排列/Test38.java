import javax.security.auth.callback.CallbackHandler;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;

/**
 * 输入一个字符串，按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串 abc，则打印出由字符 a, b, c 所能排列出来的所有字符串 abc, acb, bac, bca, cab 和 cba。
 * <p>
 * 1、全排列
 * 2、所有字母的组合
 */

class Test38 {
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        System.out.println(solution38.Permutation("abc"));
    }
}

class Solution38 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str.length() < 1 || str == null)
            return res;
        Permutation(str.toCharArray(), 0, res);
        Collections.sort(res);
        return res;
    }

    private void Permutation(char[] chs, int index, ArrayList<String> list) {
        if (index == chs.length - 1)
            list.add(new String(chs));
        for (int i = index; i < chs.length; i++) {
            if (i == index || chs[i] != chs[index]) {
                swap(chs, i, index);
                Permutation(chs, index + 1, list);
                swap(chs, i, index);
            }
        }
    }

    private void swap(char[] chs, int i, int j) {
        char temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }
}