import java.util.HashMap;

/**
 * Created by wei4liverpool on 12/2/16.
 */
public class WordPattern {
    public static void main(String[] args) {
        boolean result=matchWordPattern("aac","cat cat dog");
        System.out.println(result+ "    done");
    }

    static boolean matchWordPattern(String pattern,String words){
        HashMap<Character,String> patternMap=new HashMap<Character, String>();
        HashMap<String,Character> wordMap=new HashMap< String,Character>();
        char[] chars=pattern.toCharArray();
        String[] word=words.split(" ");
        if(chars.length!=word.length){
            System.out.println("not match");
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
