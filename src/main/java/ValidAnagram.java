import java.util.Hashtable;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p>
 * <p>
 * Created by wei4lfc on 20/02/2018.
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String s1 = "rat";
        String t1 = "car";
        System.out.println("first:" + isAnagram(s, t));
        System.out.println("second:" + isAnagram(s1, t1));

    }


    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        if (sChars.length != t.length()) {
            return false;
        }
        for (int i = 0; i < sChars.length; i++) {
            if (hash.get((int) sChars[i]) != null) {
                int v = hash.get((int) sChars[i]);
                v++;
                hash.put((int) sChars[i], v);
            } else {
                hash.put((int) sChars[i], 1);
            }
        }

        for (int i = 0; i < tChars.length; i++) {
            if (hash.get((int) tChars[i]) != null) {
                int v = hash.get((int) tChars[i]);
                v--;
                if (v == 0) {
                    hash.remove((int) tChars[i]);
                } else {
                    hash.put((int) tChars[i], v);
                }
            } else {
                return false;
            }
        }

        if (hash.size() == 0) {
            return true;
        }

        return false;

    }
}
