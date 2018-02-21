/**
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * <p>
 * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
 * <p>
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 * <p>
 * <p>
 * Created by wei4lfc on 21/02/2018.
 */
public class NimGame {
    public static void main(String[] args) {
        System.out.println("4:" + canWinNim(4));
        System.out.println("5:" + canWinNim(5));

    }

    public static boolean canWinNim(int n) {
        /*
        int[] s = new int[]{2, 3, 4, 5, 6};
        for (int i = 0; i < s.length && s[i] < n; i++) {
            if (n % s[i] == 1 || n % s[i] == 2 || n % s[i] == 3) {
                return true;
            } else {
                return false;
            }

        }
        return false;
        */
        if (n % 4 <= 3 && n % 4 != 0) {
            return true;
        }
        return false;
    }
}
