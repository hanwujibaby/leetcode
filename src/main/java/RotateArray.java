/**
 *
 * Rotate an array of n elements to the right by k steps.

 For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

 Note:

 Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

 Hint:

 Could you do it in-place with O(1) extra space?
 *
 * Created by weixing on 17/10/11.
 *
 */
public class RotateArray {

  public static void main(String[] args) {

    int[] nums=new int[]{1,2,3,4,5,6};
    rotate(nums,2);
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<nums.length;i++){
      sb.append(nums[i]+"\t");
    }
    System.out.printf(sb.toString());
  }


  public static void rotate(int[] nums, int k) {
    int _k=k%nums.length;
    revert(nums,nums.length-_k,nums.length-1);
    revert(nums,0,nums.length-_k-1);
    revert(nums,0,nums.length-1);
    /*
    if(nums.length-k<0){
      revert(nums,nums.length-1,nums.length-1);
    }else{
      revert(nums,nums.length-k,nums.length-1);
    }
    if(nums.length-k-1<0){
      revert(nums,0,0);
    }else{

      revert(nums,0,nums.length-k-1);
    }
    */
  }


  public static void revert(int[] nums, int start, int end){
    int mid=(end+1-start)/2+start;
    for(;start<=mid;start++,end--){
      if(start<=end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
      }
    }

  }




}
