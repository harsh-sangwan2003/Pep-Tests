import java.util.*;

public class short_message {

    public static int pos = 0;

    public static String decodeString(String str) {

        StringBuilder sb = new StringBuilder();
        String nums = "";

        for (int i = pos; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '[' && str.charAt(i) != ']')
                sb.append(str.charAt(i));

            else if (Character.isDigit(str.charAt(i)))
                nums += str.charAt(i);

            else if (str.charAt(i) == '[') {

                pos = i + 1;
                String next = decodeString(str);

                for (int val = Integer.valueOf(nums); val > 0; val--)
                    sb.append(next);

                nums = "";
                i = pos;
            }

            else if (str.charAt(i) == ']') {

                pos = i;
                return sb.toString();
            }

        }

        return sb.toString();

    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        String str = scn.nextLine();
        String ans = decodeString(str);

        System.out.println(ans);
        scn.close();
    }
}