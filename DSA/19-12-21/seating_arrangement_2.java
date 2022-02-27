import java.util.*;

public class seating_arrangement_2 {

    public static int searchInsert(int[] nums, int target) {
        // write your code here..
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] > target)
                hi = mid - 1;

            else
                lo = mid + 1;
        }

        return lo;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        System.out.println(searchInsert(arr, target));

        scn.close();
    }
}