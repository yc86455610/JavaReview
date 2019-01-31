/**
 * 给定一个数字，按照如下规则翻译成字符串：1 翻译成“a”，2 翻译成“b”... 26 翻译成“z”。
 * 一个数字有多种翻译可能，例如 12258 一共有 5 种，
 * 分别是 abbeh，lbeh，aveh，abyh，lyh。
 * 实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 */

class Test46 {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        String s = "12258";
        System.out.println(solution46.numDecodings(s));

    }
}

class Solution46 {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            //one 和 two 分别是1(2)个数字转换为整形
            int one = Integer.valueOf(s.substring(i - 1, i));
            if (one != 0)
                dp[i] += dp[i - 1];

            //检查两个数字可否翻译成字母
            if (s.charAt(i - 2) == '0')
                continue;

            int two = Integer.valueOf(s.substring(i - 2, i));
            if (two <= 26)
                dp[i] += dp[i - 2];
        }

        return dp[n];
    }
}