import java.util.*;

/**
 *
 */
public class IntersectionOfTwoArrays2 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 4,4,4,9, 5,9,9};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] m = intersect(nums1, nums2);
        for (int i = 0; i < m.length; i++) {
            System.out.printf(m[i] + "\t");

        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> bigHash = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> smallHash = new HashMap<Integer, Integer>();
        if (nums1.length > nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                if (bigHash.get(nums1[i]) != null) {
                    int v = bigHash.get(nums1[i]);
                    v++;
                    bigHash.put(nums1[i], v);
                } else {
                    bigHash.put(nums1[i], 1);
                }
            }
            for (int j = 0; j < nums2.length; j++) {
                if (smallHash.get(nums2[j]) != null) {
                    int v = smallHash.get(nums2[j]);
                    v++;
                    smallHash.put(nums2[j], v);

                } else {
                    smallHash.put(nums2[j], 1);
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                if (bigHash.get(nums2[i]) != null) {
                    int v = bigHash.get(nums2[i]);
                    v++;
                    bigHash.put(nums2[i], v);
                } else {
                    bigHash.put(nums2[i], 1);
                }
            }

            for (int j = 0; j < nums1.length; j++) {
                if (smallHash.get(nums1[j]) != null) {
                    int v = smallHash.get(nums1[j]);
                    v++;
                    smallHash.put(nums1[j], v);
                } else {
                    smallHash.put(nums1[j], 1);
                }
            }

        }
        Iterator<Map.Entry<Integer, Integer>> smallIT = smallHash.entrySet().iterator();
        List<Integer> list = new ArrayList<Integer>();
        while (smallIT.hasNext()) {
            int smallV = smallIT.next().getKey();
            if (bigHash.get(smallV) != null) {
                int smallCnt = smallHash.get(smallV);
                int largeCnt = bigHash.get(smallV);
                int cnt = smallCnt < largeCnt ? smallCnt : largeCnt;
                for (int i = 0; i < cnt; i++) {
                    list.add(smallV);
                }
            }
        }
        int[] m = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            m[i] = list.get(i);
        }
        return m;

    }
}
