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
        String s4 = "abba";
        System.out.printf(":" + lengthOfLongestSubstring(s2) + "\n");
    }

    public static int lengthOfLongestSubstring(String s) {

        /**
         1、首先，判断当前字符是否包含在map中，如果不包含，将该字符添加到map（字符，字符在数组下标）,
         此时没有出现重复的字符，左指针不需要变化。此时不重复子串的长度为：i-left+1，与原来的maxLen比较，取最大值；

         2、如果当前字符 ch 包含在 map中，此时有2类情况：
         1）当前字符包含在当前有效的子段中，如：abca，当我们遍历到第二个a，当前有效最长子段是 abc，我们又遍历到a，
         那么此时更新 left 为 map.get(a)+1=1，当前有效子段更新为 bca；
         2）当前字符不包含在当前最长有效子段中，如：abba，我们先添加a,b进map，此时left=0，我们再添加b，发现map中包含b，
         而且b包含在最长有效子段中，就是1）的情况，我们更新 left=map.get(b)+1=2，此时子段更新为 b，而且map中仍然包含a，map.get(a)=0；
         随后，我们遍历到a，发现a包含在map中，且map.get(a)=0，如果我们像1）一样处理，就会发现 left=map.get(a)+1=1，实际上，left此时
         应该不变，left始终为2，子段变成 ba才对。

         为了处理以上2类情况，我们每次更新left，left=Math.max(left , map.get(ch)+1).
         另外，更新left后，不管原来的 s.charAt(i) 是否在最长子段中，我们都要将 s.charAt(i) 的位置更新为当前的i，
         因此此时新的 s.charAt(i) 已经进入到 当前最长的子段中！
         */
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;

    }


    /*
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
    */
}
