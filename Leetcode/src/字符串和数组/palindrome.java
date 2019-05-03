package 字符串和数组;

import javax.xml.transform.SourceLocator;

public class palindrome {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.isPalindrome(13231));
//        System.out.println(solution.isPalindrome(1011));

        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";
//        System.out.println(solution.isPalindrome(str1));
//        System.out.println(solution.isPalindrome(str2));

        String str3 = "babad";
        String str4 = "cbbd";
//        System.out.println(solution.longestPalindrome(str3));
//        System.out.println(solution.longestPalindrome2(str3));
//        System.out.println(solution.longestPalindrome2(str4));

        String str5 = "abcba";
        String str6 = "abccba";
        System.out.println(solution.isPalindrome_simple1(str5));
        System.out.println(solution.isPalindrome_simple1(str6));

        System.out.println(solution.isPalindrome_simple2(str5));
        System.out.println(solution.isPalindrome_simple2(str6));
    }
}

class Solution {
    //判断一个字符串是回文字符串
    public boolean isPalindrome_simple1(String str) {
        //StringBuffer和StringBuilder有内置的reverse方法
        if (str == null) return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

    //遍历，首尾字符对比
    public boolean isPalindrome_simple2(String str) {
        if (str == null) return false;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    //9、判断一个数字是否是回文数
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int right = 0;
        while (x > right) {
            right = right * 10 + x % 10;
            x /= 10;
        }
        return x == right || x == right / 10;
    }

    //234、判断一个链表是否是回文链表
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //快慢指针，翻转链表
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        //根据快慢指针，找到链表的中点
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    //翻转链表
    private ListNode reverse(ListNode head) {
        if (head.next == null)
            return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //125、判断一个字符串是否为有效的回文串
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            //左右两个指针不断缩小比较，遇到非法字符则跳过
            if (!((s.charAt(left) >= 'a' && s.charAt(left) <= 'z') || (s.charAt(left) >= '0' && s.charAt(left) <= '9'))) {
                left++;
                continue;
            }
            if (!((s.charAt(right) >= 'a' && s.charAt(right) <= 'z') || (s.charAt(right) >= '0' && s.charAt(right) <= '9'))) {
                right--;
                continue;
            }
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }

    //5、最长的回文子串
    private int pos = 0, len = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        for (int i = 0; i < s.length() - 1; i++) {
            extend(s, i, i);
            extend(s, i, i + 1);
        }
        return s.substring(pos, pos + len);
    }

    private void extend(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (len < right - left - 1) {
            pos = left + 1;
            len = right - left - 1;
        }
    }

    public String longestPalindrome2(String s) {
        if (s == null)
            return null;
        for (int size = s.length(); size > 0; size--) {
            for (int low = 0, high = low + size - 1; high < s.length(); low++, high++) {
                if (checkPalindrome(s, low, high)) {
                    return s.substring(low, high + 1);
                }
            }
        }
        return s.substring(0, 1);
    }

    public boolean checkPalindrome(String s, int low, int high) {
        while (low <= high) {
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                return false;
            }
        }
        return true;
    }
}