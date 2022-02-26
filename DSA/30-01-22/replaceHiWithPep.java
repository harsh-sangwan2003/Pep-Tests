import java.io.*;
import java.util.*;

public class replaceHiWithPep {

    public static String replace(String str) {

        if (str.length() == 0 || str.length() == 1)
            return str;

        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {

            String ros = replace(str.substring(2));
            return "pep" + ros;
        }

        else {

            String ros2 = replace(str.substring(1));
            return str.charAt(0) + ros2;
        }
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

        String res = replace(str);

        System.out.println(res.charAt(i));
        System.out.println(res);
    }
}