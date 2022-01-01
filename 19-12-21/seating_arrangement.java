import java.util.Scanner;

public class seating_arrangement {

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                return i;
            }

            else if (nums[i] > target) {

                return i;
            }
        }

        return nums.length;
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