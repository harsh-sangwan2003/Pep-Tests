import java.io.*;
import java.util.*;

public class microMaze {

    public static boolean canReach(int r, int c, int[][] arr) {

        if (r < 0 || c < 0 || r >= arr.length || c >= arr.length || arr[r][c] == 0)
            return false;

        else if (r == arr.length - 1 && c == arr[0].length - 1)
            return true;

        arr[r][c] = 0;

        boolean op1 = canReach(r - 1, c, arr);
        boolean op2 = canReach(r, c - 1, arr);
        boolean op3 = canReach(r + 1, c, arr);
        boolean op4 = canReach(r, c + 1, arr);

        arr[r][c] = 1;

        return (op1 || op2 || op3 || op4);
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        boolean res = canReach(0, 0, arr);

        if (res)
            System.out.println("Yes");

        else
            System.out.println("No");
    }
}