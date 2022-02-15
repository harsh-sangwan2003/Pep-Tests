import java.io.*;
import java.util.*;

public class lexi_print {
    public static void rec(int i, int n) {
        if (i >= n) {
            return;
        }
        System.out.println(i);
        for (int j = 0; j < 10; j++) {
            rec(10 * i + j, n);
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= 9; i++) {
            rec(i, n);
        }
    }
}