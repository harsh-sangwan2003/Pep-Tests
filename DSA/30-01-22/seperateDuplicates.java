import java.io.*;
import java.util.*;

public class seperateDuplicates {

    public static String duplicate1(String str) {

        StringBuilder sb = new StringBuilder("");
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (prev == curr) {
                sb.append("*");
                sb.append(curr);
            }

            else {

                sb.append(curr);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String str = s.split(" ")[0];
        int i = Integer.parseInt(s.split(" ")[1]);

        String s1 = duplicate1(str);

        System.out.println(s1.charAt(i));
        System.out.println(s1);
    }
}