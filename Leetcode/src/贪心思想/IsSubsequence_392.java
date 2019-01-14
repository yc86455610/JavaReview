package 贪心思想;

/**
 * s = "abc", t = "ahbgdc"
 * Return true.
 */

public class IsSubsequence_392 {
    public static void main(String[] args) {
        Solution_392 solution = new Solution_392();
        String s = "abc", t = "ahbgdc";
        System.out.println(solution.isSubsequence(s, t));
    }

}

class Solution_392 {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;

    }
}