import java.util.Stack;

/**
 * Created by wei4liverpool on 1/1/17.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

   1
  / \
 2   2
 / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
 1
 / \
 2   2
 \   \
 3    3
 Note:
 Bonus points if you could solve it both recursively and iteratively.

 Solution:使用栈来实现非递归的二叉树DFS遍历;
 */
public class SymmeticTree {
    public static void main(String[] args) {
        System.out.println("value:" + maximumGap(new int[]{1,2,2,-1,3,-1,3}));
    }


    public static boolean maximumGap(int[] nums) {
        boolean isResult=false;
        int rootIndex=0;
        Stack<Integer> stack=new Stack<Integer>();
        StringBuilder sb=new StringBuilder();
        StringBuilder rsb=new StringBuilder();
        sb.append(nums[rootIndex]);
        rsb.append(nums[rootIndex]);
        //stack.push(rootIndex);

        int lfIndex=rootIndex*2+1;
        int rfIndex=rootIndex*2+2;

        if(lfIndex<nums.length && nums[lfIndex]>=0){
            stack.push(lfIndex);
        }


        while(stack.isEmpty()==false){
            int r=stack.pop();
            int nextLeftIndex=r*2+1;
            int nextRightIndex=r*2+2;

            //if(nextRightIndex<nums.length&& nums[nextRightIndex]>0){
            if(nextRightIndex<nums.length){
                stack.push(nextRightIndex);
            }

            //if(nextLeftIndex<nums.length&& nums[nextLeftIndex]>0){
            if(nextLeftIndex<nums.length){
                stack.push(nextLeftIndex);
            }
            sb.append(String.valueOf(nums[r]));
        }
        System.out.println("sb:"+sb.toString());


        if(rfIndex<nums.length && nums[rfIndex]>=0){
            stack.push(rfIndex);
        }

        while(stack.isEmpty()==false){
            int r=stack.pop();
            int nextLeftIndex=r*2+1;
            int nextRightIndex=r*2+2;

            //if(nextLeftIndex<nums.length&& nums[nextLeftIndex]>0){
            if(nextLeftIndex<nums.length){
                stack.push(nextLeftIndex);
            }

            //if(nextRightIndex<nums.length&& nums[nextRightIndex]>0){
            if(nextRightIndex<nums.length){
                stack.push(nextRightIndex);
            }

            rsb.append(String.valueOf(nums[r]));
        }

        System.out.println("rsb:"+rsb.toString());

        return rsb.toString().equals(sb.toString());
    }
}
