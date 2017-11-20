import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * Created by weixing on 17/11/19.
 *
 * solution:利用HashTable即可，注意判断{1,0,1,1}这种case
 */
public class ContainsDuplicateII {


  public static void main(String[] args) {
    int[] a=new int[]{1,0,1,2,2};

    System.out.print("result:"+containsNearbyDuplicate(a,1)+"\n");

  }

  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
    HashMap<Integer ,ArrayList<Integer>> mapList=new HashMap<Integer, ArrayList<Integer>>();

    for(int i=0;i<nums.length;i++){
      if(map.containsKey(nums[i])==false){
        map.put(nums[i],i);
      }else{
        int j=(Integer)map.get(nums[i]);
        if(nums[i]==nums[j]){
          if(mapList.containsKey(nums[i])){
            ArrayList<Integer> list=mapList.get(nums[i]);
            list.add(i);
            mapList.put(nums[i],list);
          }else{
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add(map.get(nums[i]));
            list.add(i);
            mapList.put(nums[i],list);
          }
        }
      }

    }


    Iterator it= mapList.keySet().iterator();
    while(it.hasNext()){
      Integer key=(Integer)it.next();

      List<Integer> list= (List<Integer>) mapList.get(key);
      for(int i=0;i<list.size();i++){
        if(i+1<=list.size()-1){
          if(list.get(i+1)-list.get(i)<=k){
            return true;
          }
        }
      }

    }

    return false;
  }

}
