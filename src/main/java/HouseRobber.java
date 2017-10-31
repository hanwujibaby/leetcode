import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is
 * that adjacent houses have security system connected
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house,
 determine the maximum amount of money you can rob tonight without alerting the police.

 *
 * Created by weixing on 17/10/18.
 *
 * solution:递归的思想，对于a[n]的数组而言，最大的值为f(a[n-2])+a[a.length-1]和f(a[n-1])中的大者
 */
public class HouseRobber {
  static HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();

  public static void main(String[] args) {

    //int[] a=new int[]{183,219,57,193,94,233,202,154,65,240,97,234,100,249,186,66,90,238,168,128,177,235,50,81,185,165,217,207,88,80,112,78,135,62,228,247,211};
    int[] a=new int[]{1,1,1,1};
    long s1=System.currentTimeMillis();
    System.out.println(rob(a));
    long s2=System.currentTimeMillis();
    System.out.println("cost time:"+(s2-s1)+"ms");
  }


  public static int rob(int[] nums) {

    if(nums.length==1){
      map.put(0,nums[0]);
      return nums[0];
    }

    if(nums.length==2){
      map.put(0,nums[0]);
      return Math.max(nums[0],nums[1]);
    }

    if(nums.length>=3){
      int[] nums1=Arrays.copyOfRange(nums,0,nums.length-2);
      int[] nums2=Arrays.copyOfRange(nums,0,nums.length-1);

      int a=map.containsKey(nums2.length)?map.get(nums2.length):rob(nums2);
      int a1=map.containsKey(nums1.length)?map.get(nums1.length):rob(nums1);
      int b=a1+nums[nums.length-1];
      int result=a>b?a:b;
      map.put(nums.length,result);
      return result;
    }
    return 0;

  }

}
