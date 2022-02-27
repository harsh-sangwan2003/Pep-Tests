import java.util.*;

public class keyPad {

    // Given keypad sequence respective to mobile digit number
    static String[] codes = { ".", "abc", "def", "gh", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

    public static int keyPad(String str, String[] codes, String ans) {
        // write your code here

        if (str.length() == 0) {

            System.out.println(ans);
            return 1;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        int count = 0;

        for (int i = 0; i < codes[ch - '0'].length(); i++) {

            count += keyPad(ros, codes, ans + codes[ch - '0'].charAt(i));
        }

        return count;
    }

    // Driver program
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(keyPad(s, codes, ""));
    }

}