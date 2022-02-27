import java.util.Scanner;

public class war_mines {

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

        changeArr(arr, n, m);

        ans(arr, n, m);

        scn.close();
    }

    static int min_run = Integer.MAX_VALUE;
    static int[][] dir = { { 0, -1 }, { -1, 0 }, { 1, 0 }, { 0, 1 } };

    public static void ans(int[][] arr, int n, int m) {

        for (int r = 0; r < n; r++)
            helper(arr, r, 0, 0);

        if (min_run != Integer.MAX_VALUE)
            System.out.println(min_run);

        else
            System.out.println("soldier:KIA");
    }

    public static void helper(int[][] arr, int sr, int sc, int count) {

        if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || arr[sr][sc] <= 0)
            return;

        if (sc == arr[0].length - 1) {

            if (count < min_run)
                min_run = count;

            return;
        }

        arr[sr][sc] = -1;

        helper(arr, sr, sc - 1, count + 1);
        helper(arr, sr - 1, sc, count + 1);
        helper(arr, sr + 1, sc, count + 1);
        helper(arr, sr, sc + 1, count + 1);

        arr[sr][sc] = 1;
    }

    public static void changeArr(int[][] arr, int n, int m) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (arr[i][j] == 0) {

                    if (i - 1 >= 0)
                        arr[i - 1][j] = -1;

                    if (i + 1 < n)
                        arr[i + 1][j] = -1;

                    if (j - 1 >= 0)
                        arr[i][j - 1] = -1;

                    if (j + 1 < m)
                        arr[i][j + 1] = -1;
                }
            }
        }
    }
}