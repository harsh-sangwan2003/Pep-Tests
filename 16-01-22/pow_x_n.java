import java.util.*;

public class pow_x_n {

    public static int helper(int num, int power, int curr, int inc) {

        int sum = inc + (int) Math.pow(curr, power);

        if (sum == num)
            return 1;

        else if (sum > num)
            return 0;

        int count = 0;

        count += helper(num, power, curr + 1, sum);
        count += helper(num, power, curr + 1, inc);

        return count;
    }

    public static void main(String args[]) {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        int ans = helper(x, n, 1, 0);
        System.out.println(ans);
        scn.close();
    }
}