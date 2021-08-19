import java.util.*;

/***
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 输入: s = ""
 * 输出: 0
 *
 *
 * 提示： 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 *
 * 解法：循环遍历，将重复的字母放入到hashList中，然后遍历list元素之间的长度，保留最长的字段。
 *
 */
public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbb";
        String s2 = "pwwkew";
        String s3 = "aab";
        String s4 = "aab";
        System.out.printf("length:" + lengthOfLongestSubstring(s3));

    }

    public static int lengthOfLongestSubstring(String s) {
        int sum = 0;
        LinkedHashMap<String, List<Integer>> hashList = new LinkedHashMap<String, List<Integer>>();
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            if (hashList.containsKey(str)) {
                List<Integer> posList = hashList.get(str);
                posList.add(i);
            } else {
                List<Integer> posList = new ArrayList<Integer>();
                posList.add(i);
                hashList.put(str, posList);
            }
        }
        Iterator<Map.Entry<String, List<Integer>>> it = hashList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<Integer>> entry = it.next();
            String key = entry.getKey();
            List<Integer> posList = entry.getValue();
            //字符串中只出现了1次
            if (posList.size() == 1) {
                HashMap<String, Integer> conflictMap = new HashMap<String, Integer>();
                for (int k = posList.get(0); k <= s.length() - 1; k++) {
                    if (conflictMap.containsKey(String.valueOf(s.charAt(k)))) {
                        break;
                    } else {
                        conflictMap.put(String.valueOf(s.charAt(k)), 1);
                    }
                }
                int tmp = conflictMap.size();
                if (tmp > sum) {
                    sum = tmp;
                }

            }
            for (int i = 0; i < posList.size(); i++) {
                int realCurrPos = posList.get(i);
                int nextPos = i + 1;
                int realNextPos = 0;
                if (nextPos <= posList.size() - 1) {
                    realNextPos = posList.get(nextPos) - 1;
                }
                if (nextPos == posList.size()) {
                    realNextPos = s.length() - 1;
                }

                HashMap<String, Integer> conflictMap = new HashMap<String, Integer>();
                int endPos = realNextPos > 0 ? realNextPos : posList.size() - 1;
                for (int k = realCurrPos; k <= endPos; k++) {
                    if (conflictMap.containsKey(String.valueOf(s.charAt(k)))) {
                        break;
                    } else {
                        conflictMap.put(String.valueOf(s.charAt(k)), 1);
                    }
                }
                int tmp = conflictMap.size();
                if (tmp > sum) {
                    sum = tmp;
                }
            }
        }
        return sum;
    }
}
