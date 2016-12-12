import java.util.HashMap;
import java.util.Stack;

/**
 * Created by wei4liverpool on 12/12/16.
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

 */

public class ValidParentheses {

 public static void main(String[] args) {
  System.out.println(isValidParentheses("()[]]"));

 }


 public  static boolean isValidParentheses(String text){
  HashMap<Character,Character> map=new HashMap<Character, Character>();
  map.put('(',')');
  map.put('{','}');
  map.put('[',']');

  char[] chars=text.toCharArray();
  Stack<Character> stack=new Stack<Character>();

  for(int i=0;i<chars.length;i++){
   if(map.containsKey(chars[i])){
    stack.push(chars[i]);
   }else if(map.containsValue(chars[i])){
    if(stack.isEmpty()==false && !isPair(stack.peek(),chars[i])){
     return false;
    }
   }else{
    return false;
   }

  }
  if(stack.empty()==false){
   return false;
  }else{
   return true;
  }

 }

 public static boolean isPair(char c1,char c2){
  return (c1=='('&&c2==')')||(c1=='['&&c2==']')||(c1=='{'&&c2=='}');
 }

}
