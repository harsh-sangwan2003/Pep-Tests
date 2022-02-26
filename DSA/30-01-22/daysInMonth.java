import java.io.*;
import java.util.*;

public class daysInMonth {

    public static int check(String a[], String s) {
        for (int i = 0; i < 7; i++) {
            if (a[i].equals(s)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String days[] = { "mon", "tues", "wed", "thurs", "fri", "sat", "sun" };

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int val[] = { 4, 4, 4, 4, 4, 4, 4 };
            int x = check(days, s);
            for (int i = 29; i <= n; i++) {
                val[x % 7]++;
                x++;
            }

            for (int i = 0; i < 7; i++) {
                System.out.print(val[i] + " ");
            }
            System.out.println();
        }
    }
}