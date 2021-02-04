import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/***
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 */
public class ThreaSum {

    public static void main(String[] args) {
        //int[] s = new int[]{-1, 0, 1, 2, -1, -4};
        int[] s = new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        List<List<Integer>> sum = threeSum(s);

        for (int i = 0; i < sum.size(); i++) {
            List<Integer> list = sum.get(i);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < list.size(); j++) {
                sb.append(list.get(j));
                sb.append(",");
            }
            System.out.printf(sb.toString() + "\n");
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> resultList = new ArrayList<List<Integer>>();
        ArrayList<Integer> negtiveNumList = new ArrayList<Integer>();
        ArrayList<Integer> positiveNumList = new ArrayList<Integer>();
        HashMap<Integer, Integer> positiveMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> negtiveMap = new HashMap<Integer, Integer>();
        HashMap<String, Integer> multyMap = new HashMap<String, Integer>();
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negtiveNumList.add(nums[i]);
                negtiveMap.put(nums[i], 1);
            } else {
                positiveNumList.add(nums[i]);
                positiveMap.put(nums[i], 1);
                if (nums[i] == 0) {
                    flag++;
                }
            }
        }


        for (int i = 0; i < negtiveNumList.size() - 1; i++) {
            for (int j = i + 1; j < negtiveNumList.size(); j++) {
                int f = (negtiveNumList.get(i) + negtiveNumList.get(j)) * (-1);
                if (positiveMap.containsKey(f)) {
                    String s = negtiveNumList.get(i) + "," + negtiveNumList.get(j);
                    String s1 = negtiveNumList.get(j) + "," + negtiveNumList.get(i);
                    if ((multyMap.containsKey(s) == false) && (multyMap.containsKey(s1) == false)) {
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(negtiveNumList.get(i));
                        list.add(negtiveNumList.get(j));
                        list.add(f);
                        resultList.add(list);
                        multyMap.put(s, 1);
                        multyMap.put(s1, 1);
                    }
                }
            }
        }

        for (int i = 0; i < positiveNumList.size() - 1; i++) {
            for (int j = i + 1; j < positiveNumList.size(); j++) {
                int f = (positiveNumList.get(i) + positiveNumList.get(j)) * (-1);
                if (negtiveMap.containsKey(f)) {
                    String s = positiveNumList.get(i) + "," + positiveNumList.get(j);
                    String s1 = positiveNumList.get(j) + "," + positiveNumList.get(i);
                    if ((multyMap.containsKey(s) == false) && (multyMap.containsKey(s1) == false)) {
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(positiveNumList.get(i));
                        list.add(positiveNumList.get(j));
                        list.add(f);
                        resultList.add(list);
                        multyMap.put(s, 1);
                        multyMap.put(s1, 1);
                    }
                }
            }
        }

        if (flag >= 3) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(0);
            list.add(0);
            list.add(0);
            resultList.add(list);
        }

        return resultList;
    }

}
