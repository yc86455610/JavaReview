import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    //有效的字母异位词
    public static void main(String[] args) {
        solution_isAnagram solution_isvalid = new solution_isAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(solution_isvalid.isAnagram_3(s, t));
    }
}

class solution_isAnagram {
    //直接排序
    public boolean isAnagram_1(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return String.valueOf(sChars).equals(String.valueOf(tChars));
    }

    //hashmap
    public boolean isAnagram_2(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            //有key就用这个key，没有就用默认的键值
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            Integer count = map.get(ch);
            if (count == null)
                return false;
            else if (count > 1) {
                map.put(ch, count - 1);
            } else {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }

    //数组
    public boolean isAnagram_3(String s, String t) {
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        for (char ch : s.toCharArray()) {
            sCounts[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            tCounts[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sCounts[i] != tCounts[i])
                return false;
        }
        return true;
    }
}
