import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Created by weixing on 17/10/9.
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 For example:
 1 -> A
 2 -> B
 3 -> C
 ...
 26 -> Z
 27 -> AA
 28 -> AB
 */
public class ExcelSheetColumnTitle {
  static StringBuilder sb=new StringBuilder();

  public static void main(String[] args) {
    System.out.printf(convertToTitle(702));
  }


  public static String convertToTitle(int n) {
    List<Integer> list =new ArrayList<Integer>();
    Stack<Integer> stack=new Stack<Integer>();
    int i=0;
    int m=0;
    if(n<=26){
      return getValue(n);
    }

    if(n<=26){
      sb.append(getValue(n)).append(getValue(n%26));
      return sb.toString();
    }else{
      while(n>26){
        i++;
        m=n%26;
        if(m==0){
          stack.push(26);
        }else{
          stack.push(m);
        }
        n=n/26;
      }
      stack.push(n%26);
      while(stack.isEmpty()==false){
        sb.append(getValue(stack.pop()));
      }
      return sb.toString();
    }

  }

  static HashMap<Integer,String> map=new HashMap<Integer, String>();
  static {
    map.put(1,"A");
    map.put(2,"B");
    map.put(3,"C");
    map.put(4,"D");
    map.put(5,"E");
    map.put(6,"F");
    map.put(7,"G");
    map.put(8,"H");
    map.put(9,"I");
    map.put(10,"J");
    map.put(11,"K");
    map.put(12,"L");
    map.put(13,"M");
    map.put(14,"N");
    map.put(15,"O");
    map.put(16,"P");
    map.put(17,"Q");
    map.put(18,"R");
    map.put(19,"S");
    map.put(20,"T");
    map.put(21,"U");
    map.put(22,"V");
    map.put(23,"W");
    map.put(24,"X");
    map.put(25,"Y");
    map.put(26,"Z");

  }

  static String getValue(Integer k){
    return map.get(k);
  }

}
