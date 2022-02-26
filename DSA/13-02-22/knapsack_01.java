import java.util.Scanner;

public class knapsack_01 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] vals = new int[n];
        for (int i = 0; i < n; i++)
            vals[i] = scn.nextInt();

        int[] wts = new int[n];
        for (int i = 0; i < n; i++)
            wts[i] = scn.nextInt();

        int cap = scn.nextInt();

        int maxVal = knapsack(n, vals, wts, cap);
        System.out.println(maxVal);

        scn.close();
    }

    public static int knapsack(int n, int[] vals, int[] wts, int cap) {

        int[][] dp = new int[n + 1][cap + 1];

        for (int i = 1; i < dp.length; i++) {

            for (int j = 1; j < dp[0].length; j++) {

                int exclude = dp[i - 1][j];
                int include = 0;

                if (j - wts[i - 1] >= 0)
                    include = vals[i - 1] + dp[i - 1][j - wts[i - 1]];

                dp[i][j] = Math.max(include, exclude);
            }
        }

        return dp[n][cap];
    }
}