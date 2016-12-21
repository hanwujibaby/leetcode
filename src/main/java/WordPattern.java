import java.util.HashMap;

/**
 * Created by wei4liverpool on 12/2/16.
 *
 * Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */
public class WordPattern {
    public static void main(String[] args) {
        boolean result=matchWordPattern("jquery","jquery");
        System.out.println(result+ "    done");
    }

    static boolean matchWordPattern(String pattern,String words){
        HashMap<Character,String> patternMap=new HashMap<Character, String>();
        HashMap<String,Character> wordMap=new HashMap< String,Character>();
        char[] chars=pattern.toCharArray();
        String[] word=words.split(" ");
        if(chars.length!=word.length){
            System.out.println("not match");
            return false;
        }

        for(int i=0;i<chars.length;i++){
            patternMap.put(chars[i],word[i]);
            wordMap.put(word[i],chars[i]);
        }


        for(int i=0;i<chars.length;i++){
            if(!patternMap.get(chars[i]).equals(word[i])){
                return false;
            }

            if(!wordMap.get(word[i]).equals(chars[i])){
                return false;
            }
        }

        return true;
    }


}
