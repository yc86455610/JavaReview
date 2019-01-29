/**
 * 将一个字符串中的空格替换成 "%20"。
 * <p>
 * Input:
 * "A B"
 * <p>
 * Output:
 * "A%20B"
 */


class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        StringBuffer str = new StringBuffer("A B C");
        System.out.println(solution.replaceString(str));
//        System.out.println(str.append('D'));
    }
}

class Solution {
    public String replaceString(StringBuffer str) {
        int p1 = str.length() - 1;
        for (int i = 0; i <= p1; i++) {
            if (str.charAt(i) == ' ')
                str.append("  ");
        }

        int p2 = str.length() - 1;
        while (p1 >= 0 && p2 > p1) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, c);
            }
        }
        return str.toString();
    }
}