import java.util.*;

public class sonu_v_monu {
    public static int ok(int[] nums, int i, int j, int chance) {

        if (i > j)
            return 0;

        if (chance == 0)
            return Math.max(nums[i] + ok(nums, i + 1, j, 1), nums[j] + ok(nums, i, j - 1, 1));

        else
            return Math.min(ok(nums, i + 1, j, 0), ok(nums, i, j - 1, 0));

    }

    public static boolean PredictTheWinner(int[] nums) {

        int two = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++)
            two += nums[i];

        int one = ok(nums, 0, nums.length - 1, 0);
        two -= one;

        return (one >= two);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        boolean ans = PredictTheWinner(nums);
        System.out.println(ans);

        scn.close();
    }
}