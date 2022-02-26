import java.util.Scanner;

public class lexicographical_printing {

    public static void dfs(int i, int n) {

        if (i >= n)
            return;

        System.out.println(i);

        for (int j = 0; j <= 9; j++)
            dfs(i * 10 + j, n);

    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= 9; i++)
            dfs(i, n);

        scn.close();
    }
}