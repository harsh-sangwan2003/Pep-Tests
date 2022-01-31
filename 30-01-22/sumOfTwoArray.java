import java.io.*;
import java.util.*;

public class sumOfTwoArray {

    public static String sumOfArrays(int[] a, int[] b) {

        int i = a.length - 1;
        int j = b.length - 1;
        StringBuilder sb = new StringBuilder("");
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int d1 = (i >= 0 ? a[i] : 0);
            int d2 = (j >= 0 ? b[j] : 0);

            int d = d1 + d2 + carry;

            carry = d / 10;
            d = d % 10;

            sb.insert(0, Integer.toString(d));

            i--;
            j--;

        }

        if (carry != 0)
            System.out.print(carry + " ");

        return sb.toString();
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = scn.nextInt();

        String res = sumOfArrays(a, b);

        for (int i = 0; i < res.length(); i++)
            System.out.print(res.charAt(i) + " ");

    }
}