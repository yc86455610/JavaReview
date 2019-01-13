package 双指针;


/**
 * 题目描述：可以删除一个字符，判断是否能构成回文字符串。
 * <p>
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 */
public class ValidPalindrome_680 {
    public static void main(String[] args) {
        Solution_680 solution = new Solution_680();
        System.out.println(solution.validPalindrome("abca"));
    }
}


class Solution_680 {
    public boolean validPalindrome(String s) {
        int i = -1, j = s.length();
        while (++i < --j) {
            if (s.charAt(i) != s.charAt(j)) {
                // 无法确认那个字符是多余的，所有左右都需验证一下
                // 只要有一个是回文数，就true返回
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }

        return true;
    }

    //判断是否为回文数
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}