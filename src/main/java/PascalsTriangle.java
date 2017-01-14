/**
 * Created by wei4liverpool on 1/13/17.
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
        [1],
       [1,1],
      [1,2,1],
     [1,3,3,1],
    [1,4,6,4,1]
 ]
 */



import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> list=generate(5);
        for(int i=0;i<list.size();i++){
            List<Integer> l=list.get(i);
            StringBuilder s=new StringBuilder();
            for(int j=0;j<l.size();j++){
                s.append(l.get(j)+",");
            }
            System.out.println(s.toString()+"\n");
        }



    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangleList=new ArrayList<List<Integer>>();
        if(numRows==1){
            List<Integer> list=new ArrayList<Integer>();
            list.add(1);
            triangleList.add(list);
            return triangleList;
        }

        if(numRows==2){
            List<Integer> list=new ArrayList<Integer>();
            list.add(1);
            triangleList.add(list);
            List<Integer> list2=new ArrayList<Integer>();
            list2.add(1);
            list2.add(1);
            triangleList.add(list2);
            return triangleList;
        }

        if(numRows>2){
            triangleList =generate(2);
            for(int start=2;start<numRows;start++){
                List<Integer> l=triangleList.get(start-1);
                List<Integer> l1=new ArrayList<Integer>();
                l1.add(1);
                for(int i=0;i<l.size();i++){
                    if(i+1<=l.size()-1){
                        int sum=l.get(i)+l.get(i+1);
                        l1.add(sum);
                    }
                }
                l1.add(1);
                triangleList.add(l1);
            }
        }
        return triangleList;

    }
}
