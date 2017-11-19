import java.util.HashMap;

/**
 *
 *
 * Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.
 * Created by weixing on 17/11/19.
 */
public class IsomorphicStrings {


  public static void main(String[] args) {

    System.out.print("result:"+isIsomorphic("egg","add")+"\n");

  }


  public static boolean isIsomorphic(String s, String t) {
    HashMap<Character,Character> map=new HashMap<Character, Character>();
    HashMap<Character,Character> _map=new HashMap<Character, Character>();

    char[] sChars=s.toCharArray();
    char[] tChars=t.toCharArray();

    if(s==null || t==null){
      return false;
    }

    if(s.length()!=t.length()){
      return false;
    }

    for(int i=0;i<sChars.length;i++){
      if(map.containsKey(sChars[i])){
        if((Character)map.get(sChars[i])!=tChars[i]){
          return false;
        }
      }else{
        if(_map.containsKey(tChars[i])){
          if((Character)_map.get(tChars[i])!=sChars[i]){
            return false;
          }
        }else{
          _map.put(tChars[i],sChars[i]);
          map.put(sChars[i],tChars[i]);
        }
      }

    }

    return true;

  }

}
