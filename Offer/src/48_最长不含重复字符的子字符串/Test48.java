import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 输入一个字符串（只包含 a~z 的字符），求其最长不含重复字符的子字符串的长度。
 * 例如对于 arabcacfr，最长不含重复字符的子字符串为 acfr，长度为 4。
 * <p>
 * 贪心
 */

class Test48 {
    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();
        String str = new String("arabcacfr");
        System.out.println(solution48.longestSubStringWithoutDuplication(str));

    }
}

class Solution48 {
    public int longestSubStringWithoutDuplication(String str) {
        int curLen = 0;
        int maxLen = 0;
        int[] preIndexs = new int[26];
        Arrays.fill(preIndexs, -1);

        for (int curI = 0; curI < str.length(); curI++) {
            int c = str.charAt(curI) - 'a';
            int preI = preIndexs[c];
            if (preI == -1 || curI - preI > curLen) {
                curLen++;
            } else {
                maxLen = Math.max(maxLen, curLen);
                curLen = curI - preI;
            }
            preIndexs[c] = curI;
        }
        maxLen = Math.max(maxLen, curLen);
        return maxLen;

    }
}