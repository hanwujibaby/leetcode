import java.util.HashMap;

/**
 * Created by weixing on 17/9/30.
 *
 *
 *
 *

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28

 */
public class ExcelSheetColumnNumber {

  static HashMap<String,Integer> map=new HashMap<String, Integer>();
  static {
    map.put("A",1);
    map.put("B",2);
    map.put("C",3);
    map.put("D",4);
    map.put("E",5);
    map.put("F",6);
    map.put("G",7);
    map.put("H",8);
    map.put("I",9);
    map.put("J",10);
    map.put("K",11);
    map.put("L",12);
    map.put("M",13);
    map.put("N",14);
    map.put("O",15);
    map.put("P",16);
    map.put("Q",17);
    map.put("R",18);
    map.put("S",19);
    map.put("T",20);
    map.put("U",21);
    map.put("V",22);
    map.put("W",23);
    map.put("X",24);
    map.put("Y",25);
    map.put("Z",26);

  }

  static Integer getValue(String k){
    return map.get(k);
  }

  public static int titleToNumber(String s) {
    char[] chars=s.toCharArray();
    int sum=0;

    for(int i=0;i<=chars.length-1;i++){
      int k=0;
      k=(int)Math.pow(26,i);
      sum+=k*getValue(String.valueOf(chars[chars.length-1-i]));
    }
    return sum;

  }

  public static void main(String[] args) {
    System.out.println(titleToNumber("ZZ"));

  }
}
