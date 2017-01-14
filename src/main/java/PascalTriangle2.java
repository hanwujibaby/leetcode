/**
 *
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].
 *
 * Created by wei4liverpool on 1/13/17.
 */
import java.util.ArrayList;
import java.util.List;
public class PascalTriangle2 {
    public static void main(String[] args) {
        List<Integer> list=getRow(5);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)+",");
        }
        System.out.println("PascalTriangle's index["+5+"] :"+sb.toString());

    }


    public static List<Integer> getRow(int rowIndex) {
        List<Integer> rowList=new ArrayList<Integer>();
        if(rowIndex==0){
            rowList.add(1);
            return rowList;
        }

        if(rowIndex==1){
            rowList.add(1);
            rowList.add(1);
            return rowList;
        }

        if(rowIndex>1){
            List<Integer> l=getRow(rowIndex-1);
            rowList.add(1);
            for(int i=0;i<l.size();i++){
                if(i+1<=l.size()-1){
                    int sum=l.get(i)+l.get(i+1);
                    rowList.add(sum);
                }
            }
            rowList.add(1);
        }
        return rowList;

    }
}
