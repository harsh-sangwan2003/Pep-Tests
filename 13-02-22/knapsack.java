import java.io.*;
import java.util.*;

public class knapsack {
    public static int onekanpsnap(int cap, int[] wt, int[] value) {
        int[][] dp = new int[wt.length + 1][cap + 1];
        int n = dp.length;
        int m = dp[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0)
                    dp[i][j] = 0;

                else if (j == 0)
                    dp[i][j] = 0;
                else {
                    int nocall = dp[i - 1][j];
                    int yescall = -1;
                    if (j - wt[i - 1] >= 0)
                        yescall = dp[i - 1][j - wt[i - 1]] + value[i - 1];

                    dp[i][j] = Math.max(yescall, nocall);
                }

            }
        }
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();

        }
        int[] wts = new int[n];
        for (int i = 0; i < n; i++) {
            wts[i] = sc.nextInt();
        }
        int cap = sc.nextInt();
        int sum = onekanpsnap(cap, wts, value);
        System.out.print(sum);
    }

}
